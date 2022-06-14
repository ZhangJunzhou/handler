package com.zjz.handler.factory;

import com.zjz.handler.GatewayHandler;
import com.zjz.handler.impl.BlacklistHandler;
import com.zjz.handler.impl.ConversationHandler;
import com.zjz.handler.impl.CurrentLimitHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FactoryHandler
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:24
 */
public class FactoryHandler {
    public static GatewayHandler getFirstGatewayHandler() {
        // 用于维持几个handler的执行顺序
        GatewayHandler gatewayHandler1 = new CurrentLimitHandler();
        GatewayHandler gatewayHandler2 = new BlacklistHandler();
        gatewayHandler1.setNextGatewayHandler(gatewayHandler2);
        GatewayHandler gatewayHandler3 = new ConversationHandler();
        gatewayHandler2.setNextGatewayHandler(gatewayHandler3);
        return gatewayHandler1;
    }

}
