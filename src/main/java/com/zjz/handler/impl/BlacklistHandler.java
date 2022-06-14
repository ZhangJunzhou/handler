package com.zjz.handler.impl;

import com.zjz.handler.GatewayHandler;

/**
 * @ClassName BlacklistHandler
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:20
 */
public class BlacklistHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第二关->黑名单拦截......");
        nextService();
    }
}
