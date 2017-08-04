package com.swf.pattern23.decorator;

/**
 * @Author shanweifeng
 * @Description: 装饰类
 * @Date: Created in 11:11 2017/8/3
 * @Modified By:
 */
public class Decorator implements Sourceable
{
    private Sourceable source;

    public Decorator(Sourceable source){
        this.source=source;
    }

    @Override
    public void method()
    {
        System.out.println("before decorator!");
        this.source.method();
        System.out.println("after decorator!");
    }
}
