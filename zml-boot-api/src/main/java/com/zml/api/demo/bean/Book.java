package com.zml.api.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Name:zhangminglei  Mail:minglei.zhang@boldseas.com
 * @version V1.0
 * @Description
 * @Date 2017-09-10 17:42
 * @since JDK 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Book {
    private String name;
    private String publishHouse;
    private Float price;
    private String isbn;
    private String userId;
}
