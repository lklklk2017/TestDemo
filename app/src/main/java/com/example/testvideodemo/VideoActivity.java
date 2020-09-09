package com.example.testvideodemo;

import android.os.Bundle;
import android.os.Environment;

import com.example.testvideodemo.Video.CommGsyAdVd;
import com.example.testvideodemo.Video.CommGsyVideoSimpleStautsCallBack;

import java.io.File;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    private CommGsyAdVd mVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        mVideo = ((CommGsyAdVd) findViewById(R.id.main_video));

        String src = "http://video-factory.oss-cn-qingdao.aliyuncs.com/%E5%85%B6%E4%BB%96/%E6%B6%B5%E6%B0%A7%E7%A1%85%E8%97%BB%E6%B3%A5%E5%AE%A3%E4%BC%A0%E7%89%87.mp4";
        String src1 = "http://video.feitianhuyu.com/1597802684ol_ad.mp4?e=1598499724&token=MnpcatdZWO-9ckD5k2LRsBE0p1-ygDaNH2LjmUbD:9o2OUcE4ti5w1CdhY-X5r7lNR4U=";
        String src2 = "http://video.feitianhuyu.com/MainHall.mp4?e=1598499810&token=MnpcatdZWO-9ckD5k2LRsBE0p1-ygDaNH2LjmUbD:4gWhQuUKibsAw0m00P7SpyrLnl8=";
        String path = Environment.getExternalStorageDirectory() + "/" + "FT/download/";

        mVideo.setUp(src, true, new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/testCache"), "测试视频");
        mVideo.setVideoAllCallBack(new CommGsyVideoSimpleStautsCallBack() {
            @Override
            public void onStart() {
            }

            @Override
            public void onComplete() {

            }
        });
        mVideo.startPlayLogic();
    }
}
