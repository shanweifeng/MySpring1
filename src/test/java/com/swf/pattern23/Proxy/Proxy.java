package com.swf.pattern23.Proxy;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:48 2017/8/3
 * @Modified By:
 */
public class Proxy implements Sourceable
{
    private Source source;

    public Proxy(){
        super();
        this.source=new Source();
    }

    @Override
    public void method()
    {
        before();
        source.method();
        after();
    }

    private void before(){
        System.out.println("before proxy!");
    }
    private void after(){
        System.out.println("after proxy!");
    }
}
