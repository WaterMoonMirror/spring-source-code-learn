package com.wondersgroup.jg.sscl.factory.simple;

import com.wondersgroup.jg.sscl.factory.MengNiuMilk;
import com.wondersgroup.jg.sscl.factory.Milk;
import com.wondersgroup.jg.sscl.factory.YiliMalk;

/**
 *  简单牛奶工厂方法
 */
public class SimpleFactoryMail  {
    /**
     *  根据牛奶名称获取对应牛奶
     * @param name 牛奶名称
     * @return 牛奶
     */
    public Milk getMilk(String name){
        if ("伊利".equals(name)){
            return new YiliMalk();
        }else if ("蒙牛".equals(name)){
            return new MengNiuMilk();
        }else {
            System.out.println("你所输入的牛奶名称，没有对应的牛奶");
            return null;
        }
    }
}
