package com.john.componentization_demo;

import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

@Route(path = "/app/LauncherActivity")
public class LauncherActivity extends AppCompatActivity {

    private static final String TAG = "LauncherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launcher_layout);
        ImageView imageView = findViewById(R.id.iv);
        String name = getIntent().getStringExtra("name");
        Log.e(TAG, "onCreate:------ " + name);
        Observable.create(new ObservableOnSubscribe<String>() {

            @Override
            public void subscribe(@NonNull ObservableEmitter<String> observableEmitter) throws Exception {
                observableEmitter.onNext("hdhdh");
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<String>() {
                    @Override
                    public void onNext(@NonNull String s) {

                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Glide.with(this).load("").into(imageView);
        PopupWindow popupWindow=new PopupWindow(this);
        popupWindow.showAsDropDown(imageView);
        Dialog dialog=new Dialog(this);
        dialog.show();
        Thread thread=  new Thread(new Runnable() {
           @Override
           public void run() {

           }
       });
        thread.start();
        thread.interrupt();

        Handler handler=new Handler(){
            @Override
            public void dispatchMessage(Message msg) {
                super.dispatchMessage(msg);
            }
        };
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
