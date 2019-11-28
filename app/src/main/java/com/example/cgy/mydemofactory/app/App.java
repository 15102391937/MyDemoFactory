package com.example.cgy.mydemofactory.app;

import android.app.Application;

import com.orhanobut.logger.Logger;

/**
 * Created by ChenGY on 2017/7/25.
 */

public class App extends Application {
    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static App getInstance() {
        return mInstance;
    }

    private void initAppStatusListener() {
        ForegroundCallbacks.init(this).addListener(new ForegroundCallbacks.Listener() {
            @Override
            public void onBecameForeground() {
                Logger.t("WsManager").d("应用回到前台调用重连方法");
            }

            @Override
            public void onBecameBackground() {
                Logger.t("WsManager").d("应用回到后台调用？？方法");
            }
        });
    }
}
