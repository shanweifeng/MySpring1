package com.swf.pattern23.abstractFactory;

import com.swf.pattern23.Sender;

/**
 * @Author shanweifeng
 * @Description:
 * @Date: Created in 13:41 2017/7/31
 * @Modified By:
 */
public interface Provider
{
    Sender produce();
}
