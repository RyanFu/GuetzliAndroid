package com.androidyuan.compress;

/**
 * Copyright (c) 2016. BiliBili Inc.
 * Created by wei on 17-4-10 ,email:602807247@qq.com
 */

public class CompressJNI {

    static {
        System.loadLibrary("guetzli");
    }


    /**
     *
     * @param in input img;
     * @param out out img;
     * @return 0:suc ,1:fail
     */
    native public static int compress(String in,String out);


}