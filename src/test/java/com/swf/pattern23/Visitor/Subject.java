package com.swf.pattern23.Visitor;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:58 2017/8/8
 * @Modified By:
 */
public interface Subject
{
    void accept(Visitor visitor);

    String getSubject();
}
