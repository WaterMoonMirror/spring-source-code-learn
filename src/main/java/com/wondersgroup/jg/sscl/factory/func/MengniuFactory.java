package com.wondersgroup.jg.sscl.factory.func;

import com.wondersgroup.jg.sscl.factory.MengNiuMilk;
import com.wondersgroup.jg.sscl.factory.Milk;

public class MengniuFactory implements Factory {
    public Milk getMilk() {
        return new MengNiuMilk();
    }
}
