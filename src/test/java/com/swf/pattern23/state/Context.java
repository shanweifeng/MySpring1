package com.swf.pattern23.state;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:40 2017/8/8
 * @Modified By:
 */
public class Context
{
    private State state;

    public Context(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public void method() {
        if (state.getValue().equals("state1")) {
            state.method1();
        } else if (state.getValue().equals("state2")) {
            state.method2();
        }
    }
}
