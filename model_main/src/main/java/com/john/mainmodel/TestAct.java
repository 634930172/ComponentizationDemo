package com.john.mainmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.github.mzule.activityrouter.annotation.Router;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/7 13:43
 * <p/>
 * Description:
 */

@Router(value = "test/:name/:age", stringParams = "name", intParams = "age")
public class TestAct extends AppCompatActivity {

    private static final String TAG = "TestAct";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_act_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", -1);
        Log.e(TAG, "onCreate: name= " + name + " age= " + age);
    }
}
