package com.swf.pattern23.Bridge;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:18 2017/8/4
 * @Modified By:
 */
public abstract class Bridge
{
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource()
    {
        return source;
    }

    public void setSource(Sourceable source)
    {
        this.source = source;
    }
}
