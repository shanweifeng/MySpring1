package com.swf.pattern23.Iterator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:28 2017/8/8
 * @Modified By:
 */
public interface Iterator
{
    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
