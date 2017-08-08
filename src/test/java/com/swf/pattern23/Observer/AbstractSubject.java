package com.swf.pattern23.Observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:19 2017/8/8
 * @Modified By:
 */
public abstract class AbstractSubject implements Subject
{
    public Vector<Observer> vector = new Vector<Observer>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
