package com.wondersgroup.jg.sscl.factory.func;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void getMilk() {
        //System.out.println(new Factory().getMilk(););


        //货比三家
        //不知道谁好谁好谁坏
        //配置，可能会配置错
        Factory factory = new YiliFactory();
        System.out.println(factory.getMilk());
    }
}