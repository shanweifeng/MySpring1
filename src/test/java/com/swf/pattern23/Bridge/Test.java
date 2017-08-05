package com.swf.pattern23.Bridge;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:20 2017/8/4
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Bridge bridge = new MyBridge();
        Sourceable source = new SourceSub1();
        bridge.setSource(source);
        bridge.method();
        source = new SourceSub2();
        bridge.setSource(source);
        bridge.method();
    }
}
