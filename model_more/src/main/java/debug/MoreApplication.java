package debug;


import android.util.Log;

import com.john.common.LeakApplication;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/3 16:38
 * <p/>
 * Description:
 */
public class MoreApplication extends LeakApplication {

    private static final String TAG="MainApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "MainApplication model is onCreate----");
    }
}
