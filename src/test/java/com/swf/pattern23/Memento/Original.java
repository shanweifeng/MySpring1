package com.swf.pattern23.Memento;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:19 2017/8/8
 * @Modified By:
 */
public class Original
{
    private String value;

    public Original(String value){
        this.value=value;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
