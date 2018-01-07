package com.dch;

/**
 * 我的手机
 */
public class Phone {

    protected String brand;
    protected double price;
    protected double weight;
    protected String owner;


    public Phone() {


        this.owner = "董存辉";


    }


    public Phone(String brand, double price, double weight, String owner) {
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Phone(String owner) {


        this.owner = owner;


    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", weight='" + weight + '\'' +
                ", owner='" + owner + '\'' +
                '}' + owner + "是个" + isRich();
    }


    /**
     * @return 判断是否土豪
     */
    public String isRich() {

        return (this.price > 3000) ? "土豪" : "穷b";
    }
}
