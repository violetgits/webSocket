package com.violet.config;

import org.springframework.context.annotation.Configuration;

/**
 * 连接池配置. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 17:41
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Configuration
public class DruidConfiguration {

    /*@ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();

        // 添加druid的监控过滤器，当前只演示监控的功能，因此只有一个过滤器，可以实现多个过滤器
        LinkedList<Filter> filtersList = new LinkedList();
        filtersList.add(filter());
        druidDataSource.setProxyFilters(filtersList);

        return druidDataSource;
    }


    @Bean
    public Filter filter() {
        StatFilter statFilter = new StatFilter();
        // SQL执行时间超过2s种的被判定为慢日志
        statFilter.setSlowSqlMillis(2000);
        //显示慢日志
        statFilter.setLogSlowSql(true);
        //合并SQL，有时，一些相同的慢日志过多影响阅读，开启合并功能
        statFilter.setMergeSql(true);
        return statFilter;
    }

    @Bean
    public ServletRegistrationBean<StatViewServlet> servletRegistrationBean() {
        return new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
    }*/
}
