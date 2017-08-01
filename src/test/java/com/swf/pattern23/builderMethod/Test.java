package com.swf.pattern23.builderMethod;

import com.swf.pattern23.Sender;

import java.util.List;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 13:56 2017/8/1
 * @Modified By:
 */
public class Test
{
    public static void main(String[] args){
        BuilderFactory bf=BuilderFactory.getInstance();
        bf.produceMailSender(5);
        bf.produceSmsSender(5);
        List<Sender> list = bf.getList();
        System.out.println(list);
    }
}
