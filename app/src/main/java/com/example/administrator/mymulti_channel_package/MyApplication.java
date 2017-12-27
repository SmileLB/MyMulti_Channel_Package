package com.example.administrator.mymulti_channel_package;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;

/**
 * Created by LiBing
 * on 2017/12/27 0027
 * describe:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UMConfigure.init(this, null, null, UMConfigure.DEVICE_TYPE_PHONE, null);
    }
}
