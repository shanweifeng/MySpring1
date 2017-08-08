package com.swf.pattern23.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:48 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Collection collection = new MyCollection(list);
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
