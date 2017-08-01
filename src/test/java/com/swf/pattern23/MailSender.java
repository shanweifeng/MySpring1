package com.swf.pattern23;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:28 2017/7/31
 * @Modified By:
 */
public class MailSender implements Sender
{
    @Override
    public void send()
    {
        System.out.println("this is mailsender!");
    }
}
