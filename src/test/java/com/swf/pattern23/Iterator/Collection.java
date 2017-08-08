package com.swf.pattern23.Iterator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:27 2017/8/8
 * @Modified By:
 */
public interface Collection
{
    public com.swf.pattern23.Iterator.Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
