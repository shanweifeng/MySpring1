package com.swf.pattern23.Visitor;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:57 2017/8/8
 * @Modified By:
 */
public class MyVisitor implements Visitor
{
    @Override
    public void visit(Subject sub)
    {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
