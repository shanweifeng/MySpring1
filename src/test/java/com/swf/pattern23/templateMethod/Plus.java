package com.swf.pattern23.templateMethod;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 10:14 2017/8/8
 * @Modified By:
 */
public class Plus extends AbstractCalculator
{
    public Plus(){
        split="\\+";
    }
    @Override
    public int calculate(int num1, int num2)
    {
        return num1 + num2;
    }
}
