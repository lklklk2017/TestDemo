package com.example.testvideodemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView mTxt;
    private TextView mTxt1;
    private Handler mHandler = new Handler(Looper.getMainLooper());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTxt = findViewById(R.id.main_txt);
        mTxt1 = findViewById(R.id.main_txt1);

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    int i = 0;
                    while (true) {
                        Thread.sleep(1000);

                        final int finalI = i;
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                mTxt.setText("开始计数：" + finalI);
                            }
                        });
                        ++i;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}

