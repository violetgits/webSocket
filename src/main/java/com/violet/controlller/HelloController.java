package com.violet.controlller;

import com.violet.entity.User;
import com.violet.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public User hello() {
        return userService.getUser();
    }

    @GetMapping("/insert")
    public int insert(@Param("User") User user) {
        return userService.insert(user);
    }
}
