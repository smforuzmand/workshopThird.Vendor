package model;

public class Sandwich extends Product {

    public Sandwich(String productName, double price) {
        super.getProductName();
        super.getPrice();
        super.id = 2;
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
        return "The Sandewich Price is" + this.getPrice();
    }

    @Override
    public String use() {
        return " Use the Sandewich For launch! :" + this.getProductName();
    }

    @Override
    public String toString() {
        return "Sandewich{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }

}
