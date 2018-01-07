package com.dch;

/**
 * 测试
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Phone phone = new Phone();
        phone.setBrand("华为");
        phone.setPrice(3000d);


        Phone iphone5s = new Phone("苹果5s", 4500d, 256.5d, "魏晶晶");
        Phone nokia = new Phone("nokia", 500d, 256.5d, "董存辉");
//
//        System.out.println(iphone5s.toString());
//        System.out.println(nokia.toString());


        NokiaPhone nokiaPhone = new NokiaPhone();
        nokiaPhone.setPrice(10000d);


        NokiaPhone nokia2000 = new NokiaPhone();


        System.out.println(nokiaPhone.toString());
        System.out.println(nokia2000.toString());


        HuaWeiPhone huaWeiPhone = new HuaWeiPhone();
        huaWeiPhone.setCameraConfig("800万");


        System.out.println(huaWeiPhone.toString());


//        Phone nokia = new Phone("nokia", 500d, 256.5d, "董存辉");

        Call call = new Call();
        call.call(nokia, "huangbin");
        call.call(iphone5s, "董存辉");
    }

}
