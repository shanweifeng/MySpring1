package com.swf.pattern23;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:29 2017/7/31
 * @Modified By:
 */
public class SmsSender implements Sender
{

    @Override
    public void send()
    {
        System.out.println("this is sms sender!");
    }
}
