package com.zjz.handler.controller;

import com.zjz.handler.GatewayHandler;
import com.zjz.handler.factory.FactoryHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HandlerController
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:27
 */
@RestController
public class HandlerController {

    @RequestMapping("/handler")
    public String clientHandler(){
        GatewayHandler firstGatewayHandler = FactoryHandler.getFirstGatewayHandler();
        firstGatewayHandler.service();
        return "success";
    }
}
