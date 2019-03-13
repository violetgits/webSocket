package com.violet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

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
public class SpringbootApplication extends SpringBootServletInitializer {

    public SpringbootApplication() {
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
