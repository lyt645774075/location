package com.taobao.ju.core;

/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public interface LocationInfo {

    public boolean accept(RouteInfo routeInfo);

    public Object getLocatedBean();

}
