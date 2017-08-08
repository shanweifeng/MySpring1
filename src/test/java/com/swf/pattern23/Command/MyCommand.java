package com.swf.pattern23.Command;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:09 2017/8/8
 * @Modified By:
 */
public class MyCommand implements Command
{
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec()
    {
        receiver.action();
    }
}
