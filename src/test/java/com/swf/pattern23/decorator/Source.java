package com.swf.pattern23.decorator;

/**
 * @Author shanweifeng
 * @Description: 被装饰类
 * @Date: Created in 11:10 2017/8/3
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
