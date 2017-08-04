package com.swf.pattern23.Proxy;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:52 2017/8/3
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Sourceable source=new Proxy();
        source.method();
    }
}
