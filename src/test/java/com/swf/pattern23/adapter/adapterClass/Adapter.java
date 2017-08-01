package com.swf.pattern23.adapter.adapterClass;

import com.swf.pattern23.adapter.Source;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Adapter extends Source implements TargetTable {
    @Override
    public void method2() {
        System.out.println("this is targetTable method2!");
    }
}
