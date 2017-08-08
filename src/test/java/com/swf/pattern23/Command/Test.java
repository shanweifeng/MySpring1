package com.swf.pattern23.Command;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:12 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
