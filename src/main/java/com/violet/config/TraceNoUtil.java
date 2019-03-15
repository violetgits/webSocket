package com.violet.config;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.MDC;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-15 11:50
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
public class TraceNoUtil {

    public TraceNoUtil() {
    }

    static void newTraceNo() {
        MDC.put("traceNo", RandomStringUtils.randomAlphabetic(12));
    }

    static void clearTraceNo() {
        MDC.remove("traceNo");
    }

    /*public static void newTraceNo(String parentTranceNo) {
        if (StringUtils.isNotEmpty(parentTranceNo)) {
            MDC.put("traceNo", parentTranceNo + "-" + RandomStringUtils.randomAlphanumeric(6));
        } else {
            newTraceNo();
        }
    }

    public static String getTraceNo() {
        return MDC.get("traceNo");
    }*/


}
