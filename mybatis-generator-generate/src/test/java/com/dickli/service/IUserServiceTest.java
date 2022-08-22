package com.dickli.service;

import com.alibaba.fastjson.JSON;
import com.dickli.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class IUserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    void save() {
    }

    @Test
    void modify() {
        userService.modifyById(User.builder().id(1L).userName("张三儿").build());
    }

    @Test
    void removeById() {
    }

    @Test
    void queryById() {
    }

    @Test
    void queryList() {
    }

    @Test
    void queryPageList() {
        System.out.println("=========" + JSON.toJSONString(userService.queryPageList(User.builder().status(1).build(), 0, 0)));
    }
}