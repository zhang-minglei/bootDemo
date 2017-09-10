package com.zml.api.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Name:zhangminglei  Mail:minglei.zhang@boldseas.com
 * @version V1.0
 * @Description
 * @Date 2017-09-10 17:40
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class User {
    private String name;
    private String address;
    private String phone;
    private Integer age;
}
