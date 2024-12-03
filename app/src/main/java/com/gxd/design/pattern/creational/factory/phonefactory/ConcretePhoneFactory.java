package com.gxd.design.pattern.creational.factory.phonefactory;

import com.gxd.design.pattern.creational.factory.phone.Phone;

public class ConcretePhoneFactory implements PhoneFactory {
    @Override
    public <T extends Phone> T createPhone(Class<T> phoneClass) {
        T concretePhone = null;
        try {
            concretePhone = phoneClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return concretePhone;
    }
}
