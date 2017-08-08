package com.swf.pattern23.Memento;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:22 2017/8/8
 * @Modified By:
 */
public class Storage
{
    private Memento memento;

    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento()
    {
        return memento;
    }

    public void setMemento(Memento memento)
    {
        this.memento = memento;
    }
}
