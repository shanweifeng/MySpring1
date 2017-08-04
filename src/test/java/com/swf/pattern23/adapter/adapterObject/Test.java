package com.swf.pattern23.adapter.adapterObject;

import com.swf.pattern23.adapter.Source;
import com.swf.pattern23.adapter.TargetTable;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Test {
    public static void main(String[] args){
        Source sour = new Source();
        TargetTable target = new Wrapper(sour);
        target.method1();;
        target.method2();
    }
}
