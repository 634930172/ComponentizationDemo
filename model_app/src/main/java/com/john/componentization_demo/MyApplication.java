package com.john.componentization_demo;


import android.util.Log;

import com.github.mzule.activityrouter.annotation.Module;
import com.github.mzule.activityrouter.annotation.Modules;
import com.john.common.BaseApplication;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/3 16:44
 * <p/>
 * Description:
 */
@Modules({"model_main", "model_list", "model_more","model_app"})
public class MyApplication extends BaseApplication {

    private static final String TAG="MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "MyApplication is onCreate---" );
    }
}