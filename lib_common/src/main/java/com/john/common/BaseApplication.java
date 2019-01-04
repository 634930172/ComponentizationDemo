package com.john.common;

import android.app.Application;

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
    }

    public static BaseApplication getApplication() {
        return application;
    }

}
