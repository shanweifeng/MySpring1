package com.swf.pattern23.Mediator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:10 2017/8/8
 * @Modified By:
 */
public class MyMediator implements Mediator
{
    private User user1;
    private User user2;

    @Override
    public void createMediator()
    {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll()
    {
        user1.work();
        user2.work();
    }
}
