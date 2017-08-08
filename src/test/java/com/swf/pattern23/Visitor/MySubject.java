package com.swf.pattern23.Visitor;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:58 2017/8/8
 * @Modified By:
 */
public class MySubject implements Subject
{
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    @Override
    public String getSubject()
    {
        return "love";
    }
}
