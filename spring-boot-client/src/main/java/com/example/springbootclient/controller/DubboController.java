/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.example.springbootclient.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.example.springbootserver.dubboservice.DubboService1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsz
 * @version $Id: DubboController.java,v 0.1 2019年07月01日 17:00 $Exp
 */
@RestController
public class DubboController {
    @Reference
    private DubboService1 dubboService1;

    @RequestMapping("dubbo")
    public String dubboTest() {
        System.out.println("hahaha");
        return dubboService1.test();
    }

}
