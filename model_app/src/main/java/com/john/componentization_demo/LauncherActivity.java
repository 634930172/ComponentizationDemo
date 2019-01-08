package com.john.componentization_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/app/LauncherActivity")
public class LauncherActivity extends AppCompatActivity {

    private static final String TAG = "LauncherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_layout);
        String name=getIntent().getStringExtra("name");
        Log.e(TAG, "onCreate:------ "+name );
    }

    /**
     * 跳转主页面
     */
    public void main(View view) {
        Log.e(TAG, "main: ");
    }

    /**
     * 跳转列表页面
     */
    public void list(View view) {
        ARouter.getInstance().build("/list/listAct").navigation();
    }

    /**
     * 跳转更多页面
     */
    public void more(View view) {
        Log.e(TAG, "more: ");
    }
}
