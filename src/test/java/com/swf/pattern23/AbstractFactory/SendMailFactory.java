package com.swf.pattern23.abstractFactory;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 13:42 2017/7/31
 * @Modified By:
 */
public class SendMailFactory implements Provider
{
    @Override
    public Sender produce()
    {
        return new MailSender();
    }
}
