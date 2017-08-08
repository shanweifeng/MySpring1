package com.swf.pattern23.state;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:41 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] agrs){
        State state = new State();
        Context context = new Context(state);

        //设置第一种状态
        state.setValue("state1");
        context.method();

        //设置第二种状态
        state.setValue("state2");
        context.method();
    }
}
