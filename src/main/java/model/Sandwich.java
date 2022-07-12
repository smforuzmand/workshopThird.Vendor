package model;

public class Sandwich extends Product {

    public Sandwich(String productName, double price) {
        super.setProductName(productName);
        super.setPrice(price);
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
        return " Use the Sandwich For launch! :" + this.getProductName();
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
