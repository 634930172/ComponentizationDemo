package com.john.listmodel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Author: John
 * E-mail: 634930172@qq.com
 * Date: 2019/1/4 15:55
 * <p/>
 * Description:
 */
@Route(path = "/list/listAct")
public class ListAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_act_layout);
    }
}
