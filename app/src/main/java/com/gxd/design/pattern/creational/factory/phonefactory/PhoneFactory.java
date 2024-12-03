package com.gxd.design.pattern.creational.factory.phonefactory;

import com.gxd.design.pattern.creational.factory.phone.Phone;

/**
 * Created by guoxiaodong on 2019/4/5 14:19
 */
public interface PhoneFactory {
    <T extends Phone> T createPhone(Class<T> phoneClass);
}
