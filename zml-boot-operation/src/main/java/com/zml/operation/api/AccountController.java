package com.zml.operation.api;

import com.alibaba.fastjson.JSON;
import com.zml.operation.bean.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Name:zhangminglei  Mail:love757967005@gmail.com
 * @version V1.0
 * @Description
 * @Date 2017-09-11 23:53
 * @since JDK 1.8
 */
@RestController
public class AccountController {
    Logger logger = LoggerFactory.getLogger(AccountController.class);

    @PostMapping("/user/_login")
    public void login(Map<String,String> userInfo){
        logger.info(JSON.toJSONString(userInfo));
    }

    @GetMapping("/user/{id}/books")
    public List<Book> getBooks(@PathVariable("id") Long id){
        Book book = new Book();
        book.setIsbn("1234-5678-90");
        book.setName("测试");
        book.setPrice(45.8f);
        book.setPublishHouse("北京大学出版社");
        book.setUserId("1");
        List<Book> books = new ArrayList<>();
        books.add(book);
        return books;
    }
}
