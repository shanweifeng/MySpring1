package com.swf.pattern23.Visitor;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 14:59 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Visitor visitor = new MyVisitor();
        Subject sub = new MySubject();
        sub.accept(visitor);
    }
}
