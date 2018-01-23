package com.example.a10062376.dynamicviewdemo;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y.R.Wang on 2017/12/13.
 *
 * @describe Json解析工具类
 */

public class GsonHelper {
    private GsonHelper(){}

    private static Gson instance;

    private static Gson getInstance(){
        if (instance==null){
            instance=new Gson();
        }
        return instance;
    }
    /**
     * 解析一个json字符串Object
     * @param json 要解析的字符串
     * @param type 要解析什么样子的JavaBean
     * @param <T> 泛型
     * @return 返回 T 对象
     */
    public static <T>T parse(String json,Class<T> type){
        if (json==null||"".equals(json)){
            return null;
        }
        try {
            return getInstance().fromJson(json,type);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将json字符串转换成list
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T>List<T> parseList(String json,Class<T> cls){
        if (json==null||"".equals(json)){
            return null;
        }
        Type type = new TypeToken<List<T>>() {
        }.getType();
        try {
            return getInstance().fromJson(json,type);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 将json字符串转换成arraylist
     * @param json
     * @param cls
     * @param <T>
     * @return
     */
    public static <T> ArrayList<T> parseListToArraryList(String json, Class<T> cls) {
        ArrayList<T> mList = new ArrayList<T>();
        JsonArray array = new JsonParser().parse(json).getAsJsonArray();
        for(final JsonElement elem : array){
            mList.add(getInstance().fromJson(elem, cls));
        }
        return mList;
    }



    /**
     * 实体类转换成Json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object){
        return getInstance().toJson(object);
    }
}
