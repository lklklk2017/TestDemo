package com.example.testvideodemo.Video;

import android.util.Log;

import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack;

/**
 * @Author: Created by Rod Eden
 * @Date: 2020-08-27
 * @Descirption:
 */
public abstract class CommGsyVideoSimpleStautsCallBack extends GSYSampleCallBack {

    //开始加载，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onStartPrepared(String url, Object... objects) {
        Log.i("video_callback", "【onStartPrepared】");
    }

    //加载成功，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onPrepared(String url, Object... objects) {
        Log.i("video_callback", "【onPrepared】");
        onStart();
    }

    //点击了开始按键播放，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickStartIcon(String url, Object... objects) {
        Log.i("video_callback", "【onClickStartIcon】");

    }

    //点击了错误状态下的开始按键，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickStartError(String url, Object... objects) {
        Log.i("video_callback", "【onClickStartError】");

    }

    //点击了播放状态下的开始按键--->停止，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickStop(String url, Object... objects) {
        Log.i("video_callback", "【onClickStop】");

    }

    //点击了全屏播放状态下的开始按键--->停止，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickStopFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onClickStopFullscreen】");

    }

    //点击了暂停状态下的开始按键--->播放，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickResume(String url, Object... objects) {
        Log.i("video_callback", "【onClickResume】");

    }

    //点击了全屏暂停状态下的开始按键--->播放，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickResumeFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onClickResumeFullscreen】");

    }

    //点击了空白弹出seekbar，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickSeekbar(String url, Object... objects) {
        Log.i("video_callback", "【onClickSeekbar】");

    }

    //点击了全屏的seekbar，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickSeekbarFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onClickSeekbarFullscreen】");

    }

    //播放完了，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onAutoComplete(String url, Object... objects) {
        Log.i("video_callback", "【onAutoComplete】");
        onComplete();
    }

    //进去全屏，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onEnterFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onEnterFullscreen】");

    }

    //退出全屏，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onQuitFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onQuitFullscreen】");

    }

    //进入小窗口，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onQuitSmallWidget(String url, Object... objects) {
        Log.i("video_callback", "【onQuitSmallWidget】");

    }

    //退出小窗口，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onEnterSmallWidget(String url, Object... objects) {
        Log.i("video_callback", "【onEnterSmallWidget】");

    }

    //触摸调整声音，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onTouchScreenSeekVolume(String url, Object... objects) {
        Log.i("video_callback", "【onTouchScreenSeekVolume】");

    }

    //触摸调整进度，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onTouchScreenSeekPosition(String url, Object... objects) {
        Log.i("video_callback", "【onTouchScreenSeekPosition】");
    }

    //触摸调整亮度，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onTouchScreenSeekLight(String url, Object... objects) {
        Log.i("video_callback", "【onTouchScreenSeekLight】");
    }

    //播放错误，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onPlayError(String url, Object... objects) {
        Log.i("video_callback", "【onPlayError】");
    }

    //点击了空白区域开始播放，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickStartThumb(String url, Object... objects) {
        Log.i("video_callback", "【onClickStartThumb】");
    }

    //点击了播放中的空白区域，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickBlank(String url, Object... objects) {

    }

    //点击了全屏播放中的空白区域，objects[0]是title，object[1]是当前所处播放器（全屏或非全屏）
    @Override
    public void onClickBlankFullscreen(String url, Object... objects) {
        Log.i("video_callback", "【onClickBlankFullscreen】");
    }

    public abstract void onStart();

    public abstract void onComplete();
}
