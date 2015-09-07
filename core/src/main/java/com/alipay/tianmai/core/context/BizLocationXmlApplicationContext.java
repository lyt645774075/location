package com.alipay.tianmai.core.context;

import com.alipay.tianmai.core.Localizable;
import com.alipay.tianmai.core.Locator;
import com.alipay.tianmai.core.Localizable;
import com.alipay.tianmai.core.Locator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by liyangtao on 15/9/6.
 *
 * 具有业务定位信息图的spring容器
 *
 *
 */
public class BizLocationXmlApplicationContext extends AbstractXmlApplicationContext implements Localizable {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) throws BeansException, IOException {
        super.loadBeanDefinitions(beanFactory);
    }


    @Override
    protected void initBeanDefinitionReader(XmlBeanDefinitionReader reader) {
        super.initBeanDefinitionReader(reader);
    }

    @Override
    protected Resource[] getConfigResources() {
        return super.getConfigResources();
    }

    public Locator locator() {
        return null;
    }
}
