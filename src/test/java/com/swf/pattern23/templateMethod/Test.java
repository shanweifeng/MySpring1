package com.swf.pattern23.templateMethod;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 10:15 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
