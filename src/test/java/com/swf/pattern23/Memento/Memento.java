package com.swf.pattern23.Memento;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:21 2017/8/8
 * @Modified By:
 */
public class Memento
{
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }
}
