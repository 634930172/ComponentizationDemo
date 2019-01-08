package com.john.mainmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/3 16:28
 * <p/>
 * Description:
 */

//@Router(value = "main/:name/:age", stringParams = "name", intParams = "age")
@Route(path = "/main/MainAct")
public class MainAct extends AppCompatActivity {

    private static final String TAG = "MainAct";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", -1);
        Log.e(TAG, "onCreate: name= " + name + " age= " + age);
    }

    //跳转到更多组件去
    public void goMore(View view) {
        Log.e(TAG, "goMore: -----------------");
        //        Routers.open(this, "john://more/john/26");
        ARouter.getInstance().build("/more/MoreAct").
                withString("name", "john").withInt("age", 330).
                navigation();
    }

    //跳转到本地组件
    public void goTest(View view) {
        Log.e(TAG, "goTest: -----------------");
        //        Routers.open(this, "john://test/mary/22");
        ARouter.getInstance().build("/main/TestAct").
                withString("name", "john").withInt("age", 3377).
                navigation();
    }


    public void goLauncher(View view) {
        //        Routers.open(this, "john://launcher/meme");
        ARouter.getInstance().build("/app/LauncherActivity").
                withString("name", "john").withInt("age", 33).
                navigation();
    }

}
