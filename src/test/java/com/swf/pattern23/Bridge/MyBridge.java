package com.swf.pattern23.Bridge;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:19 2017/8/4
 * @Modified By:
 */
public class MyBridge extends Bridge
{
    public void method(){
        getSource().method();
    }
}
