package com.zml.api.demo.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Name:zhangminglei  Mail:minglei.zhang@boldseas.com
 * @version V1.0
 * @Description
 * @Date 2017-09-10 17:46
 * @since JDK 1.8
 */
@Data
@NoArgsConstructor
@Component
public class LoginResult {

    public static String SUCCESS = "SUCCESS";
    public static String USERNAME_OR_PASSWORD_ERROR = "Login name or password error!";
    public static String ERROR = "Server error or no active sign in plugin!";

    private boolean success;
    private String message;
    private Long userId;
    private String token;
    private Date expire = DateTime.now().plusDays(1).toDate();

    public static LoginResult success(Long userId){
        LoginResult loginResult = new LoginResult();
        loginResult.setSuccess(true);
        loginResult.setMessage(SUCCESS);
        loginResult.setUserId(userId);
        return loginResult;
    }
}
