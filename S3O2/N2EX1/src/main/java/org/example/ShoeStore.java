package org.example;

public class ShoeStore {

    private String shoeName;
    private float price;
    private float size;

    public ShoeStore(String shoeName, float price, float size) {
        this.shoeName = shoeName;
        this.price = price;
        this.size = size;
    }

    public String getShoeName() {
        return shoeName;
    }

    public float getPrice() {
        return price;
    }

    public float getSize() {
        return size;
    }

    public void setShoeName(String shoeName) {
        shoeName = shoeName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void sell(MethodPayment methodPayment){
        System.out.println("Make the payment of: "+ price);
        methodPayment.pay();

    }

    @Override
    public String toString() {
        return "The model " + shoeName + '\'' +
                " in size " + size +
                " has a price of " + price + "$.";
    }
}
