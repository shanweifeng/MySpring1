package com.swf.pattern23.abstractFactory;

import com.swf.pattern23.Sender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 13:43 2017/7/31
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
        provider = new SendSmsFactory();
        sender = provider.produce();
        sender.send();
    }
}
