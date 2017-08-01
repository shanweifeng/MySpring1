package com.swf.pattern23.factoryMethod.StaticFactoryMethod;

import com.swf.pattern23.Sender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:39 2017/7/31
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Sender sender = SendFactory.produceMail();
        sender.send();
        sender= SendFactory.produceSms();
        sender.send();
    }
}
