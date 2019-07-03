/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.example.springbootclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lsz
 * @version $Id: TestController.java,v 0.1 2019年07月02日 9:31 $Exp
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test(){
        return "Hello World!";
    }
}
