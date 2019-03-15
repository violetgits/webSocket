package com.violet.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 11:49
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@Slf4j
public class TraceNoFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        TraceNoUtil.newTraceNo();
        try {
            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            TraceNoUtil.clearTraceNo();
        }
    }

    @Override
    public void destroy() {

    }
}
