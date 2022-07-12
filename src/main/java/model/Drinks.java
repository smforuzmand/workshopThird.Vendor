package model;

public class Drinks extends Product {

    public Drinks(String productName, double price) {
        super.getProductName();
        super.getPrice();
        super.id = 3;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }

    @Override
    public String examine() {
        return "The Drink Price is" + this.getPrice();
    }

    @Override
    public String use() {
        return " Use the Drinks For Dance! :" + this.getProductName();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}




