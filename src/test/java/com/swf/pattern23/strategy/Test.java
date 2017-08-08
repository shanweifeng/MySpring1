package com.swf.pattern23.strategy;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 10:04 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        String exp = "2*8";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
