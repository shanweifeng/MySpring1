package com.swf.pattern23.adapter.adapterClass;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Test {
    public static void main(String[] args){
        TargetTable target = new Adapter();
        target.method1();
        target.method2();
    }
}
