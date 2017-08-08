package com.swf.pattern23.Mediator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:20 2017/8/8
 * @Modified By:
 */
public class test
{
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
