package com.dch;


/**
 *
 */
public class HuaWeiPhone extends Phone {


    /**
     * 重写构造方法
     */
    public HuaWeiPhone() {
        this.setPrice(3500d);

        this.brand = "huawei";
    }



    private String cameraConfig;


    public String getCameraConfig() {
        return cameraConfig;
    }

    public void setCameraConfig(String cameraConfig) {
        this.cameraConfig = cameraConfig;
    }


    @Override
    public String toString() {
        return "HuaWeiPhone{" +
                "cameraConfig='" + cameraConfig + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
