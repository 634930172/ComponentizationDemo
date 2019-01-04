package com.john.common.base;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
