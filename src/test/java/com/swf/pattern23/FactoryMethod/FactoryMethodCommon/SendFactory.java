package com.swf.pattern23.factoryMethod.FactoryMethodCommon;

import com.swf.pattern23.MailSender;
import com.swf.pattern23.Sender;
import com.swf.pattern23.SmsSender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:30 2017/7/31
 * @Modified By:
 */
public class SendFactory
{
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
