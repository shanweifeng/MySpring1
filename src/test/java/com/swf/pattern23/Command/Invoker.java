package com.swf.pattern23.Command;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:11 2017/8/8
 * @Modified By:
 */
public class Invoker
{
    private Command command;

    public Invoker(Command command){
        this.command=command;
    }

    public void action(){
        command.exec();
    }
}
