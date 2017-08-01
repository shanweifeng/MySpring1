package com.swf.pattern23.factoryMethod.MultiFactoryMethod;

import com.swf.pattern23.Sender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:36 2017/7/31
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
        sender = factory.produceSms();
        sender.send();
    }
}
