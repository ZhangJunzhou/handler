package com.zjz.handler.impl;

import com.zjz.handler.GatewayHandler;

/**
 * @ClassName ConversationHandler
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:19
 */
public class ConversationHandler extends GatewayHandler {

    @Override
    public void service() {
        System.out.println("第三关->用户会话拦截......");
        nextService();
    }
}
