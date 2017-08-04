package com.swf.pattern23.Proxy;


/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:47 2017/8/3
 * @Modified By:
 */
public class Source implements Sourceable
{
    @Override
    public void method()
    {
        System.out.println("the original method!");
    }
}
