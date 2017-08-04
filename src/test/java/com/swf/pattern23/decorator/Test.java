package com.swf.pattern23.decorator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:13 2017/8/3
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Sourceable source = new Source();
        Decorator decorator = new Decorator(source);
        decorator.method();
    }
}
