package com.simple.volleymodule.parsers;

/**
 * Created by mrsimple on 23/3/16.
 */

/**
 *
 * @param <D> 要解析的原始数据类型,比如{@link org.json.JSONArray} 或者 {@link org.json.JSONObject}等
 * @param <R> 返回的数据类型,比如  {@link java.util.List} 类型的数据集
 */
public interface RequestParser<D,R> {
    /**
     * 将网络请求返回的原始数据解析为目标类型
     * @param data 原始数据
     * @return 目标类型
     */
    public R parse(D data) ;
}
