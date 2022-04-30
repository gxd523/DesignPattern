package com.gxd.demo.design.pattern.factory.phonefactory;

import com.gxd.demo.design.pattern.factory.phone.Phone;

/**
 * Created by guoxiaodong on 2019/4/5 14:19
 */
public interface PhoneFactory {
    <T extends Phone> T createPhone(Class<T> phoneClass);
}
