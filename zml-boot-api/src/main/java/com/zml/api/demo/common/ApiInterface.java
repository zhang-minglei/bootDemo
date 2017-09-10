package com.zml.api.demo.common;

import com.zml.api.demo.bean.Book;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @author Name:zhangminglei  Mail:minglei.zhang@boldseas.com
 * @version V1.0
 * @Description
 * @Date 2017-09-10 17:22
 * @since JDK 1.8
 */
@FeignClient("zml-boot-operation")
public interface ApiInterface {

    @RequestMapping(value = "/user/_login", method = RequestMethod.POST)
    void login(@RequestBody Map<String,String> userInfo);

    @RequestMapping(value = "/user/{id}/books", method = RequestMethod.GET)
    List<Book> getBooks(@PathVariable("id") Long id);
}
