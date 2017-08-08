package com.swf.pattern23.ChainOfResponsibility;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:01 2017/8/8
 * @Modified By:
 */
public class MyHandler extends AbstractHandler implements Handler
{
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator()
    {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();
        }
    }
}
