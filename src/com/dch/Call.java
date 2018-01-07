package com.dch;

/**
 * 使用手机打电话
 */
public class Call {
    
    /**
     * @param phone
     * @param receiver
     */
    public void call(Phone phone, String receiver) {
        System.out.println(phone.getOwner() + "使用" + phone.getBrand() + "给" + receiver + "打电话");
    }
}
