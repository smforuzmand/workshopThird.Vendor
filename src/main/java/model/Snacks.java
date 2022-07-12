package model;

public class Snacks extends Product {

    public Snacks(String productName , double price) {
        super.setProductName(productName);
        super.setPrice(price);
        super.id=1;
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
        return "The Snacks Price is" + this.getPrice();
    }

    @Override
    public String use() {
        return " Use the Snacks For Fun! :"+this.getProductName();
    }

    @Override
    public String toString() {
        return "Snacks{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
