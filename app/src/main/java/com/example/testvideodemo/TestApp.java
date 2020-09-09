package com.example.testvideodemo;

import android.app.Application;

import com.shuyu.gsyvideoplayer.cache.CacheFactory;
import com.shuyu.gsyvideoplayer.cache.ProxyCacheManager;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.shuyu.gsyvideoplayer.player.PlayerFactory;
import com.shuyu.gsyvideoplayer.utils.GSYVideoType;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * @Author: Created by Rod Eden
 * @Date: 2020-08-27
 * @Descirption:
 */
public class TestApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //EXOPlayer内核，支持格式更多
//        PlayerFactory.setPlayManager(Exo2PlayerManager.class);
        //系统内核模式
//        PlayerFactory.setPlayManager(SystemPlayerManager.class);
        //ijk内核，默认模式
        PlayerFactory.setPlayManager(IjkPlayerManager.class);

        //缓存设置 支持所有模式 （除了 3mu8）
        CacheFactory.setCacheManager(ProxyCacheManager.class);

        //渲染切换设置
        GSYVideoType.setShowType(GSYVideoType.SCREEN_MATCH_FULL);

        //设置绘制模式
        GSYVideoType.setRenderType(GSYVideoType.SUFRACE);

        //ijk关闭log
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);

    }
}
