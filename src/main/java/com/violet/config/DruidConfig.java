package com.violet.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 17:41
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Configuration
public class DruidConfig {

    @Bean
    public ServletRegistrationBean<StatViewServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
    }
}
