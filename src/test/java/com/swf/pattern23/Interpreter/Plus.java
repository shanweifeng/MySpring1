package com.swf.pattern23.Interpreter;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:35 2017/8/8
 * @Modified By:
 */
public class Plus implements Expression
{
    @Override
    public int interpret(Context context)
    {
        return context.getNum1()+context.getNum2();
    }
}
