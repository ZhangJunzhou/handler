package com.zjz.handler;

/**
 * @ClassName GatewayHandler
 * @Author Junzhou Zhang
 * @Create 2022/6/14 17:16
 */
public abstract class GatewayHandler {
    // 下一个handler
    private GatewayHandler nextGatewayHandler;


    /**
     * 使用抽象类定理共同方法的行为
     */
    public abstract void service();

    public void setNextGatewayHandler(GatewayHandler gatewayHandler){
        this.nextGatewayHandler = gatewayHandler;
    }

    protected void nextService(){
        if(nextGatewayHandler!=null){
            nextGatewayHandler.service();;
        }
    }
}
