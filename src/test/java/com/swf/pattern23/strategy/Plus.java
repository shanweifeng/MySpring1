package com.swf.pattern23.strategy;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 9:57 2017/8/8
 * @Modified By:
 */
public class Plus extends AbstractCalculator implements ICalculator
{
    @Override
    public int calculate(String exp)
    {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
