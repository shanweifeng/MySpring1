package com.swf.pattern23.Observer;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 11:22 2017/8/8
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }
}
