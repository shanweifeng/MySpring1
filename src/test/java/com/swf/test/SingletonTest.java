package com.swf.test;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:04 2017/8/1
 * @Modified By:
 */
public class SingletonTest
{
    public static void main(String[] args) {
        Dog dog1=new Dog("dog1",5);
        Dog dog2 =(Dog) dog1.test();
        System.out.println(dog2.getName()+","+dog2.getAge());
    }
}
