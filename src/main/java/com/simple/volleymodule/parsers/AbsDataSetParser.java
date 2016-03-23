package com.simple.volleymodule.parsers;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * 解析数据集的抽象解析类.
 * <p/>
 * 步骤为 :
 * <p/>
 * 1. 获取结果中的JSONArray
 * 2. 依次解析 JSONArray中的数据
 * 3. 返回结果集
 * <p/>
 * Created by mrsimple on 23/3/16.
 */
public abstract class AbsDataSetParser<D, R> implements RequestParser<D, R> {

    @Override
    public R parse(D data) {
        JSONArray array = parsrJsonArray(data);
        if (array != null && array.length() > 0) {
            R result = createResultSet();
            for (int i = 0; i < array.length(); i++) {
                addItem(result, parseItem(array.optJSONObject(i)));
            }
            return result ;
        }
        return null;
    }

    /**
     * 直接将 原始数据转为 JSONArray
     *
     * @param data
     * @return
     */
    protected JSONArray parsrJsonArray(D data) {
        return (JSONArray) data;
    }

    /**
     * 创建结果集,用于存储解析到的数据
     * @return
     */
    protected abstract R createResultSet();

    /**
     * 解析到单个数据之后添加到集合中
     * @param set
     * @param item
     */
    protected abstract void addItem(R set, Object item);

    /**
     * 解析到单个数据
     * @param jsonObject
     * @return
     */
    protected abstract Object parseItem(JSONObject jsonObject);
}
