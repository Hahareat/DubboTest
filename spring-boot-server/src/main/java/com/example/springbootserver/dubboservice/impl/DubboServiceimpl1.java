/*
 * frxs Inc.  湖南兴盛优选电子商务有限公司.
 * Copyright (c) 2017-2019. All Rights Reserved.
 */
package com.example.springbootserver.dubboservice.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.springbootserver.dubboservice.DubboService1;

/**
 * @author lsz
 * @version $Id: DubboServiceimpl1.java,v 0.1 2019年07月01日 16:55 $Exp
 */
@Service
public class DubboServiceimpl1 implements DubboService1 {
    @Override
    public String test() {
        return "Dubbo服务正在消费中";
    }
}
