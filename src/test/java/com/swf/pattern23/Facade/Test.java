package com.swf.pattern23.Facade;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 16:04 2017/8/3
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Computer computer= new Computer();
        computer.startup();
        computer.shutdown();
    }
}
