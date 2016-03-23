package com.simple.volleymodule.toolbox;

import android.content.Context;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Volley的请求队列封装
 *
 * Created by mrsimple on 23/3/16.
 */
public class VolleyQueue {
    private static final String TAG = "VolleyQueue";
    private static RequestQueue sQueue;

    /**
     * 初始化请求队列, 一般放在Application或者第一个页面的onCreate中初始化
     */
    public static void initQueue(Context context) {
        if (sQueue == null) {
            sQueue = Volley.newRequestQueue(context);
        } else {
            Log.i(TAG, "Volley request queue is started !") ;
        }
    }

    public static RequestQueue getsQueue() {
        if (sQueue == null) {
            throw  new NullPointerException("sQueue is null, please call VolleyQueue's initQueue method first !! ") ;
        }
        return sQueue;
    }
}
