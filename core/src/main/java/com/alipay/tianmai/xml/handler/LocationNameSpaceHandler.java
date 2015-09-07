package com.alipay.tianmai.xml.handler;

import com.alipay.tianmai.xml.parser.LocationParser;
import com.alipay.tianmai.xml.parser.LocationParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by yangtao.lyt on 2015/7/20.
 *
 * 定制命名空间处理器
 *
 */
public class LocationNameSpaceHandler extends NamespaceHandlerSupport{
    @Override
    public void init() {
        registerBeanDefinitionParser("location", new LocationParser());
    }
}
