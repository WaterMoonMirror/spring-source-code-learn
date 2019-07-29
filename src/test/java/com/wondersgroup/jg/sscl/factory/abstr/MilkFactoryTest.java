package com.wondersgroup.jg.sscl.factory.abstr;

import org.junit.Test;

import static org.junit.Assert.*;

public class MilkFactoryTest {

    @Test
    public void getMengniu() {
        MilkFactory factory = new MilkFactory();

        //对于用户而言，更加简单了
        //用户只有选择的权利了，保证了程序的健壮性
        System.out.println(factory.getMengniu());
        /**
         * 输出：
         * com.wondersgroup.jg.sscl.factory.MengNiuMilk@694f9431
         */
    }
}