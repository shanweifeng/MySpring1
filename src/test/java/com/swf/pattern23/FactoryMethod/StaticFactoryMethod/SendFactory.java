package com.swf.pattern23.factoryMethod.StaticFactoryMethod;

import com.swf.pattern23.MailSender;
import com.swf.pattern23.Sender;
import com.swf.pattern23.SmsSender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:38 2017/7/31
 * @Modified By:
 */
public class SendFactory
{
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
