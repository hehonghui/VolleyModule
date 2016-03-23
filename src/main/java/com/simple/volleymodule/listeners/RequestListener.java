package com.simple.volleymodule.listeners;

/**
 * 请求监听器
 *
 * Created by mrsimple on 23/3/16.
 */

import com.android.volley.VolleyError;

/**
 * 请求监听器
 *
 * @param <T> 返回的数据类型
 */
public interface RequestListener<T> {
    /**
     * 请求开始
     */
    public void onStart() ;

    /**
     * 请求完成
     * @param error 如果请求失败,那么错误请求存储在error中
     * @param result 请求结果, 如果成功那么result就是结果,如果失败,那么result为null
     */
    public void onComplete(VolleyError error, T result);
}
