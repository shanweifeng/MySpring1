package com.swf.pattern23.prototype;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 16:13 2017/8/1
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args)throws Exception{
        Prototype p = new Prototype();
        Prototype p1 = (Prototype)p.clone();
        Prototype p2 = (Prototype)p.deepClone();
        System.out.println("-----------------");
    }
}
