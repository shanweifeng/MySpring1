package com.swf.pattern23.Mediator;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 15:13 2017/8/8
 * @Modified By:
 */
public abstract class User
{
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
