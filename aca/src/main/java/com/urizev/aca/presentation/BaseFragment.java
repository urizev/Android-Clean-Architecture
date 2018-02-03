package com.urizev.aca.presentation;

import android.app.Application;
import android.support.v4.app.Fragment;

public class BaseFragment<A extends Application> extends Fragment {
    private A mApp;

    public BaseActivity<A> getBaseActivity() {
        //noinspection unchecked
        return (BaseActivity<A>) getActivity();
    }

    protected A getApp() {
        if (mApp == null) {
            BaseActivity<A> activity = getBaseActivity();
            if (activity == null) {
                return null;
            }
            mApp = activity.getApp();
        }
        return mApp;
    }
}
