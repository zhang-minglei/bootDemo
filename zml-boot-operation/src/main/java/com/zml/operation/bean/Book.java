package com.zml.operation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author Name:zhangminglei  Mail:love757967005@gmail.com
 * @version V1.0
 * @Description
 * @Date 2017-09-12 00:02
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
