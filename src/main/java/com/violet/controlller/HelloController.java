package com.violet.controlller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简要说明. <br>
 *
 * <p>
 * Date-Time：  2019-03-13 10:27
 * <p>
 *
 * @author wangchao
 * @version 1.0.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
