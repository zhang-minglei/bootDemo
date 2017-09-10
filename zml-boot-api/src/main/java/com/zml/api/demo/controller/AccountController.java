package com.zml.api.demo.controller;

import com.zml.api.demo.common.ApiInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.Map;

/**
 * @author Name:zhangminglei  Mail:minglei.zhang@boldseas.com
 * @version V1.0
 * @Description
 * @Date 2017-09-10 17:33
 * @since JDK 1.8
 */
@RestController
@RefreshScope
@RequestMapping("/api/v1/account")
public class AccountController {
    Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private ApiInterface apiInterface;

    @PostMapping("/_login")
    public void login(@RequestBody Map<String, String> userInfo) {
        apiInterface.login(userInfo);
    }

    @GetMapping("/{id}/books")
    public void getBooksById(@PathVariable("id") Long id) {
        apiInterface.getBooks(id);
    }
}
