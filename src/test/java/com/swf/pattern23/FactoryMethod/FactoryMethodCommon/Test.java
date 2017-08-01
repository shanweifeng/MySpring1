package com.swf.pattern23.factoryMethod.FactoryMethodCommon;

import com.swf.pattern23.Sender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:30 2017/7/31
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
        sender = factory.produce("mail");
        sender.send();
    }
}
