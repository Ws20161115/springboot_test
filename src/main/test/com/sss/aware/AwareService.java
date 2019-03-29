package com.sss.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @ClassName AwareService
 * @Desprition TODO
 * @Author shishanshan
 * @Date 2019/3/27 12:00
 * @Version 1.0
 **/
//实现 beanNameAware,ResourceLoaderAware 接口 获得bean的名称  和 资源加载的服务
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }


    public  void outputResult(){
        System.out.println("Bean的名称为:"+beanName);
        Resource resource = loader.getResource("classpath:/test.properties");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
