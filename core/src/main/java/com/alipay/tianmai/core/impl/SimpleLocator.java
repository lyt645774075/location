package com.alipay.tianmai.core.impl;

import com.alipay.tianmai.core.LocationInfo;
import com.alipay.tianmai.core.Locator;
import com.google.common.collect.Lists;
import com.alipay.tianmai.core.LocationInfo;
import com.alipay.tianmai.core.Locator;
import com.alipay.tianmai.core.RouteInfoExtrator;

import java.util.List;

/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public class SimpleLocator implements Locator {

    private List<LocationInfo> locationInfoList = Lists.newArrayList();

    private RouteInfoExtrator routeInfoExtrator;

    @Override
    public Object getFirstLocatedBean(Object bizObj) {
        for(LocationInfo locationInfo : locationInfoList){
            if(locationInfo.accept(routeInfoExtrator.extractRouteInfo(bizObj))){
                return locationInfo.getLocatedBean();
            }
        }

        return null;
    }

    @Override
    public List<Object> getAllLocatedBean(Object bizObj) {
        List<Object> beanList = Lists.newArrayList();
        for(LocationInfo locationInfo : locationInfoList){
            if(locationInfo.accept(routeInfoExtrator.extractRouteInfo(bizObj))){
                beanList.add(locationInfo.getLocatedBean());
            }
        }
        return beanList;
    }

    @Override
    public List<LocationInfo> getAllLocationInfo() {
        return null;
    }

    @Override
    public List<LocationInfo> getAcceptedLocationInfo(Object bizObj) {
        return null;
    }
}
