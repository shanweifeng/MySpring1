package com.swf.pattern23.Mediator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:19 2017/8/8
 * @Modified By:
 */
public class User2 extends User
{
    public User2(Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void work()
    {
        System.out.println("user2 exe!");
    }

}
