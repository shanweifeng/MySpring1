package com.swf.pattern23.ChainOfResponsibility;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:01 2017/8/8
 * @Modified By:
 */
public abstract class AbstractHandler
{
    private Handler handler;

    public Handler getHandler()
    {
        return handler;
    }

    public void setHandler(Handler handler)
    {
        this.handler = handler;
    }
}
