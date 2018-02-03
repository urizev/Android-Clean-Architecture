package com.urizev.aca.presentation;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity<A extends Application> extends AppCompatActivity {
    public A getApp() {
        //noinspection unchecked
        return (A) getApplication();
    }
}
