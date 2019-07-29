package com.wondersgroup.jg.sscl.factory.abstr;

import com.wondersgroup.jg.sscl.factory.MengNiuMilk;
import com.wondersgroup.jg.sscl.factory.Milk;
import com.wondersgroup.jg.sscl.factory.func.YiliFactory;

public class MilkFactory extends AbstractFactory {
    public Milk getMengniu() {
        // 实现方法一，可以直接返回产品，这里只使用了抽象工厂模式
        return new MengNiuMilk();
    }

    public Milk getYili() {
        // 实现方法二：使用工厂方法生成的产品返回，这里使用了抽象工厂和工厂方法的组合，在实际工作中，这种使用较多
        return new YiliFactory().getMilk();
    }

    public Milk getTelunsu() {
        // 扩展代码不在演示
        return null;
    }

    public Milk getSanlu() {
        // 扩展代码不在演示
        return null;
    }
}
