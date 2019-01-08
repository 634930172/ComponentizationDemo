package com.john.common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/3 10:25
 * <p/>
 * Description:
 */
public class BaseApplication extends Application {

    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        //初始化
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }

    public static BaseApplication getApplication() {
        return application;
    }

}
