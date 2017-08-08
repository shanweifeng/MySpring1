package com.swf.pattern23.Interpreter;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 16:50 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args)
    {
        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
            .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
