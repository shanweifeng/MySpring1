package com.swf.test;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 19:04 2017/8/1
 * @Modified By:
 */
public class PersonTest
{
    public static void main(String[] args) {
        Person p1=new Person("zhangsan",18);
        Person p2=(Person)p1.clone();
        p2.setName("lis");
        p2.setAge(20);
        System.out.println("name="
            +p1.getName()+",age="+p1.getAge());
        //修改p2后，没有对p1产生影响。
    }
}
