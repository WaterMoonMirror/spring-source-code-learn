package com.wondersgroup.jg.sscl.factory.simple;

import com.wondersgroup.jg.sscl.factory.Milk;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleFactoryMailTest {

    @Test
    public void getMilk() {
        //这个new的过程实际上一个比较复杂的过程
        //有人民币及不需要自己new了
        // System.out.println(new Telunsu().getName());

        //小作坊式的生产模式
        //用户本身不再关心生产的过程，而只需要关心这个结果
        //假如：特仑苏、伊利、蒙牛
        //成分配比都是不一样的
        SimpleFactoryMail factory = new SimpleFactoryMail();
        //把用户的需求告诉工厂
        //创建产品的过程隐藏了，对于用户而且完全不清楚是怎么产生的
        System.out.println(factory.getMilk("伊利"));
        System.out.println(factory.getMilk("蒙牛"));
        System.out.println(factory.getMilk("三鹿"));
        /**
         * 输出：
         * com.wondersgroup.jg.sscl.factory.YiliMalk@694f9431
         * com.wondersgroup.jg.sscl.factory.MengNiuMilk@f2a0b8e
         * 你所输入的牛奶名称，没有对应的牛奶
         * null
         */
        //知其然，知其所以然，知其所必然
    }
}