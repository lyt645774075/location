package com.taobao.ju.core.impl;

import com.google.common.collect.Maps;
import com.taobao.ju.core.LocationInfo;
import com.taobao.ju.core.RouteInfo;

import java.util.Map;


/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public class LocationInfoImpl implements LocationInfo{

    private static final Map<String, Object> acceptedMap = Maps.newHashMap();

    private static final Map<String, Object> refusedMap = Maps.newHashMap();

    private static final Object locatedBean = null;


    @Override
    public boolean accept(RouteInfo routeInfo) {
        /*
         * 不接受的配置信息（满足任意一个，则退出）
         */
        for(Map.Entry<String, Object> entry : refusedMap.entrySet()){
            if(routeInfo.getValue(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }
        /*
         * 接受的配置信息（需满足所有的）
         */
        for(Map.Entry<String, Object> entry : acceptedMap.entrySet()){
            if(!routeInfo.getValue(entry.getKey()).equals(entry.getValue())){
                return false;
            }
        }

        return true;
    }

    @Override
    public Object getLocatedBean() {
        return locatedBean;
    }



}
