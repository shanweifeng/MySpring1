package com.swf.pattern23.factoryMethod.MultiFactoryMethod;

import com.swf.pattern23.MailSender;
import com.swf.pattern23.Sender;
import com.swf.pattern23.SmsSender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:35 2017/7/31
 * @Modified By:
 */
public class SendFactory
{
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
