package com.swf.test;

import java.io.Serializable;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 18:47 2017/8/1
 * @Modified By:
 */
public class Dog implements Cloneable
{
    private String name;
    private int age;
    public Dog(){}
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Dog dog1=new Dog("dog1",5);
        //Dog dog2=null;
        try {
            Dog dog2=(Dog)dog1.clone();
            System.out.println(dog2.getName()+","+dog2.getAge());
        } catch (CloneNotSupportedException e) {
              // TODO Auto-generated catch block
               e.printStackTrace();
        }
    }

    public Object test()
    {
        Object dog=null;
        //Dog dog2=null;
        try {
            dog=super.clone();
            //System.out.println(dog2.getName()+","+dog2.getAge());
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dog;
    }

    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public int getAge() {
         return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
