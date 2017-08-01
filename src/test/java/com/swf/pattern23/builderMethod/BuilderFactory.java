package com.swf.pattern23.builderMethod;

import com.swf.pattern23.MailSender;
import com.swf.pattern23.Sender;
import com.swf.pattern23.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 13:48 2017/8/1
 * @Modified By:
 */
public class BuilderFactory
{
    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        while(count-->0){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        while(count-->0){
            list.add(new SmsSender());
        }
    }

    private BuilderFactory(){

    }

    private static class  anonymous{
        public static BuilderFactory builderFactory = new BuilderFactory();
    }

    public static BuilderFactory getInstance(){
        return anonymous.builderFactory;
    }

    public List getList(){
        return list;
    }
}
