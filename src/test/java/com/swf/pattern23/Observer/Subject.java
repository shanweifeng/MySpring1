package com.swf.pattern23.Observer;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:14 2017/8/8
 * @Modified By:
 */
public interface Subject
{
    /*增加观察者*/
    void add(Observer observer);

    /*删除观察者*/
    void del(Observer observer);

    /*通知所有的观察者*/
    void notifyObservers();

    /*自身的操作*/
    void operation();
}
