package com.swf.pattern23.Bridge;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:04 2017/8/4
 * @Modified By:
 */
public class SourceSub2 implements Sourceable
{
    @Override
    public void method()
    {
        System.out.println("this is the second sub!");
    }
}
