package com.alipay.tianmai.core;

/**
 * Created by yangtao.lyt on 2015/7/20.
 *
 * 路由信息
 *
 */
public interface RouteInfo {

    public void addKV(String fieldName, Object fieldValue);

    public Object getValue(String fieldName);

}
