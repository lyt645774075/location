package com.taobao.ju.core;

import java.util.List;

/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public interface Locator {

    public Object getFirstLocatedBean(Object bizObj);

    public List<Object> getAllLocatedBean(Object bizObj);

    public List<LocationInfo> getAllLocationInfo();

    public List<LocationInfo> getAcceptedLocationInfo(Object bizObj);

}
