package com.swf.pattern23.Mediator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:19 2017/8/8
 * @Modified By:
 */
public class User1 extends User
{
    public User1(Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void work()
    {
        System.out.println("user1 exe!");
    }

}
