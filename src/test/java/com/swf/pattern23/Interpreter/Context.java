package com.swf.pattern23.Interpreter;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 16:50 2017/8/8
 * @Modified By:
 */
public class Context
{
    private int num1;
    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }
}
