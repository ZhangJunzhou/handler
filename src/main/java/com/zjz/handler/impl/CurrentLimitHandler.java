package com.zjz.handler.impl;

import com.zjz.handler.GatewayHandler;

/**
 * @ClassName CurrentLimitHandler
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:17
 */
public class CurrentLimitHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第一关->API接口限流......");
        nextService();
    }
}
