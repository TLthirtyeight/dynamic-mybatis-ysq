package com.baomidou.samples.mybatis.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @Author: ysq
 * @Description: FooController
 * @Date: 2020/11/17 0:06
 */
//@Component
//@Import(value = {Foo1.class, Foo2.class})
public class FooController {

    @Autowired
    private Foo1 foo1;

    @Autowired
    private Foo2 foo2;
}
