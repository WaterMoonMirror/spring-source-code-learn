package com.wondersgroup.jg.sscl.factory.func;

import com.wondersgroup.jg.sscl.factory.Milk;
import com.wondersgroup.jg.sscl.factory.YiliMalk;

/**
 *  伊利工厂
 */
public class YiliFactory implements Factory  {
    public Milk getMilk() {
        return new YiliMalk();
    }
}
