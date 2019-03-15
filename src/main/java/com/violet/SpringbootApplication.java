package com.violet;

import com.violet.config.TraceNoFilter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 10:05
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@SpringBootApplication
public class SpringbootApplication extends SpringBootServletInitializer implements CommandLineRunner {

    public SpringbootApplication() {
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Bean("traceNoFilter")
    public FilterRegistrationBean<TraceNoFilter> traceNoFilter() {
        FilterRegistrationBean<TraceNoFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new TraceNoFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Override
    public void run(String... args) {
        System.out.println("=======spring boot启动完成=======");
    }
}
