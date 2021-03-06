package com.urizev.aca.utils;

import okhttp3.Interceptor;

public class RxUtils {
    private RxUtils() { }

    public static void assertMainThread() { }

    public static void assertNonMainThread() { }

    public static void assertIOThread() { }

    public static void assertComputationThread() { }

    public static Interceptor interceptor() { return chain -> chain.proceed(chain.request()); }
}
