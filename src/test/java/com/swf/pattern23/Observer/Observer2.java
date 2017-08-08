package com.swf.pattern23.Observer;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:13 2017/8/8
 * @Modified By:
 */
public class Observer2 implements Observer
{
    @Override
    public void update()
    {
        System.out.println("observer2 has received!");
    }
}
