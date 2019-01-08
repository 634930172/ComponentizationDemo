package com.john.moremodel;

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
 * Date: 2019/1/4 16:07
 * <p/>
 * Description:
 */
//@Router(value = "more/:name/:age", stringParams = "name", intParams = "age")
    @Route(path = "/more/MoreAct")
public class MoreAct extends AppCompatActivity {
    private static final String TAG = "MoreAct";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_act_layout);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", -1);
        Log.e(TAG, "onCreate: name= " + name + " age= " + age);
    }

    //到list组件
    public void goList(View view){
        ARouter.getInstance().build("/list/listAct").navigation();
    }
}
