package com.john.mainmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.github.mzule.activityrouter.annotation.Router;
import com.github.mzule.activityrouter.router.Routers;
import com.john.common.network.client.HttpClient;


/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/3 16:28
 * <p/>
 * Description:
 */

@Router(value = "main/:name/:age", stringParams = "name", intParams = "age")
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
        Routers.open(this, "john://more/john/26");
    }

    //跳转到本地组件
    public void goTest(View view) {
        Log.e(TAG, "goTest: -----------------");
        Routers.open(this, "john://test/mary/22");
    }



    public void goLauncher(View view){
        Routers.open(this, "john://launcher/meme");
    }

}
