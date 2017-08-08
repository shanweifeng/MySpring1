package com.swf.pattern23.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:44 2017/8/8
 * @Modified By:
 */
public class MyCollection implements Collection
{
    public String string[] = {"A","B","C","D","E"};

    public List<String> list=new ArrayList<>();

    public MyCollection(List<String> list){
        this.list = list;
    }

    @Override
    public Iterator iterator()
    {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i)
    {
        return string[i];
        //return list.get(i);
    }

    @Override
    public int size()
    {
        return string.length;
        //return list.size();
    }
}
