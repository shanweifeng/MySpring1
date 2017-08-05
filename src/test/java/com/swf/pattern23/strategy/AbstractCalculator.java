package com.swf.pattern23.strategy;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 17:01 2017/8/4
 * @Modified By:
 */
public abstract class AbstractCalculator
{
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
