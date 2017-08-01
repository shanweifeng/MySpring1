package com.swf.pattern23.adapter.adapterObject;

import com.swf.pattern23.adapter.Source;
import com.swf.pattern23.adapter.adapterClass.TargetTable;

/**
 * Created by Administrator on 2017/8/2.
 */
public class Wrapper implements TargetTable {
    public Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is targetTable method2!");
    }
}
