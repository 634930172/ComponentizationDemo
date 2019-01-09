package debug;

import android.util.Log;

import com.john.common.BaseApplication;


/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/4 15:53
 * <p/>
 * Description:
 */
public class ListApplication extends BaseApplication {

    private static final String TAG="ListApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "ListApplication is onCreate------" );
    }
}
