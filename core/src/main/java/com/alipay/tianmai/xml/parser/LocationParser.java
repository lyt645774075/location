package com.alipay.tianmai.xml.parser;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * Created by yangtao.lyt on 2015/7/20.
 */
public class LocationParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        String clazz = element.getAttribute("class");
        try {
            return Class.forName(clazz);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("[LocationParser-getBeanClass] error :  " , e);
        }
    }

    @Override
    protected String getBeanClassName(Element element) {
        return super.getBeanClassName(element);
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        super.doParse(element, builder);
    }
}
