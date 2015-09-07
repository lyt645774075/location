package com.alipay.tianmai.core;

import java.util.List;

/**
 * Created by yangtao.lyt on 2015/7/20.
 *
 *
 *
 */
public interface Locator {

    public <T> T getFirstLocatedBean(Object bizObj);

    public <T> List<T> getAllLocatedBean(Object bizObj);

    public <T> T getFirstLocatedBean(RouteInfo routeInfo);

    public <T> List<T> getAllLocatedBean(RouteInfo routeInfo);

    public List<LocationInfo> getAllLocationInfo();

    public List<LocationInfo> getAcceptedLocationInfo(Object bizObj);

    public void addLocationInfo(LocationInfo locationInfo);

    public void removeLocationInfo(LocationInfo locationInfo);

    public void removeAllLocationInfo();

}
