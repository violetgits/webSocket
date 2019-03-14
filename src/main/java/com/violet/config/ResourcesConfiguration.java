package com.violet.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 资源文件夹配置. <br>
 * WebMvcConfigurerAdapter -->WebMvcConfigurer (过时接口)
 * <p>
 * Date-Time：  2019-03-14 10:48
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Configuration
public class ResourcesConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将访问地址前缀为violet/resources/的解析到资源文件夹下
        registry.addResourceHandler("violet/resources/**").addResourceLocations("classpath:/static/");
    }
}
