package com.example.testvideodemo.Video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

import com.example.testvideodemo.R;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

/**
 * @Author: Created by Rod Eden
 * @Date: 2020-08-27
 * @Descirption: 纯广告播放
 * 没有其他ui控件
 * 没有控制功能
 */
public class CommGsyAdVd extends StandardGSYVideoPlayer {
    private boolean mCanTouch = true;

    /**
     * 1.5.0开始加入，如果需要不同布局区分功能，需要重载
     *
     * @param context
     * @param fullFlag
     */
    public CommGsyAdVd(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public CommGsyAdVd(Context context) {
        super(context);
    }

    public CommGsyAdVd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.video_layout_comm_gsy_noting;
    }

    @Override
    protected void init(Context context) {
        super.init(context);
    }

    public void setAdUIStatus() {
        mCanTouch = false;
    }

    /******************* 下方重载方法，在播放开始不显示底部进度和按键，不需要可屏蔽 ********************/

    @Override
    protected void onClickUiToggle() {
        Log.i("com_gsy", "=======onClickUiToggle========");
        super.onClickUiToggle();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (!mCanTouch) {
            return true;
        }
        return super.onTouch(v, event);
    }

    @Override
    protected void changeUiToNormal() {
        super.changeUiToNormal();
        Log.i("com_gsy", "=======changeUiToNormal========");
        setAdUIStatus();
    }

    @Override
    protected void changeUiToPreparingShow() {
        Log.i("com_gsy", "=======changeUiToPreparingShow========");
        super.changeUiToPreparingShow();
    }

    @Override
    protected void changeUiToPlayingBufferingShow() {
        Log.i("com_gsy", "=======changeUiToPlayingBufferingShow========");
        super.changeUiToPlayingBufferingShow();
    }

    @Override
    protected void changeUiToPlayingShow() {
        Log.i("com_gsy", "=======changeUiToPlayingShow========");
        super.changeUiToPlayingShow();
    }

    @Override
    public void startAfterPrepared() {
        Log.i("com_gsy", "=======startAfterPrepared========");
        super.startAfterPrepared();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        Log.i("com_gsy", "=======onStartTrackingTouch========");
        super.onStartTrackingTouch(seekBar);
    }
}
