package com.swf.pattern23.Observer;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:21 2017/8/8
 * @Modified By:
 */
public class MySubject extends AbstractSubject
{
    @Override
    public void operation()
    {
        System.out.println("update self!");
        notifyObservers();
    }
}
