package com.violet.controlller;

import com.alibaba.fastjson.JSON;
import com.violet.entity.User;
import com.violet.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
@Slf4j
public class HelloController {

    @Resource
    private UserService userService;

    @GetMapping("/hello/{pageNum}/{pageSize}")
    public List<User> hello(@PathVariable int pageNum, @PathVariable int pageSize) {
        log.info("pageNum:{},pageSize:{}", pageNum, pageSize);
        return userService.getUser(pageNum, pageSize);
    }

    @GetMapping("/insert")
    public int insert(@Param("User") User user) {
        log.info("user:{}", JSON.toJSONString(user));
        return userService.insert(user);
    }
}
