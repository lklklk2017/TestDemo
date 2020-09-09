package com.example.testvideodemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class HandlerActivity extends AppCompatActivity {

    private static final String TAG = "handler_message";
    private Handler mHandler = new Handler(Looper.getMainLooper()) {
        /**
         * Subclasses must implement this to receive messages.
         *
         * @param msg
         */
        @Override
        public void handleMessage(@NonNull Message msg) {
            int what = msg.what;
            switch (what) {
                case 0:
                    Log.i(TAG, "[" + Thread.currentThread().getName() + "]:收到消息:" + what);
                    break;
                case 1:
                    //主线程中
                    Log.i(TAG, "[" + Thread.currentThread().getName() + "]:收到消息:" + what);
                    break;
            }

            Message obtain = Message.obtain();
            Message message = mHandler.obtainMessage();
        }
    };
    private ImageView img;
    private MessageThread mMessageThread;
    private MessageThread mMessageThread1;
    private TextView txt;
    private int counts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        img = findViewById(R.id.img_1);
        txt = findViewById(R.id.tv_1);

        initThread();
        initListener();
    }

    private void initThread() {
        mMessageThread = new MessageThread("msgT—0");
        mMessageThread1 = new MessageThread("msgT—1");
    }

    private void initListener() {
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMessageThread.setMessageWhat(0).start();
                mMessageThread1.setMessageWhat(1).start();
            }
        });
    }

    class MessageThread extends Thread {

        public MessageThread(String name) {
            super(name);
        }

        private int what;

        public MessageThread setMessageWhat(int what) {
            this.what = what;
            return this;
        }

        @Override
        public void run() {
            int i = 0;
            while (true) {
                try {
                    ++i;
                    sleep(2000);
                    Message message = mHandler.obtainMessage();
                    message.what = what;
                    mHandler.sendMessage(message);
                    final int finalI = i;

                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            Log.i(TAG, "[" + Thread.currentThread().getName() + "]:执行任务");
                            txt.setText("第" + (finalI) + "个任务");
                        }
                    });
                    Log.i(TAG, "[" + Thread.currentThread().getName() + "]:发送消息");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
