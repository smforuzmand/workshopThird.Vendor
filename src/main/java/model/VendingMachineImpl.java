package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    List<Product> productList = new ArrayList<>();
    List<Product> purchasedItems = new ArrayList<>();

    int depositPool;
    int[] depositionOptions = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    @Override
    public void addCurrency(int amount) {
        boolean currencyCheck = false;
        for (int deposit : depositionOptions) {
            if (amount == deposit) {
                depositPool = depositPool + amount;
                currencyCheck = true;

            }

        }
        if (!currencyCheck) {
            System.out.println("Wrong choice,try again!");

        }

    }

    @Override
    public int getBalance() {
        return this.depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : productList) {
            if (product.id == id && depositPool > product.getPrice()) {
                depositPool -= product.getPrice();
                return product;
            }
        }

        return null;
    }

    @Override
    public int endSession() {
        depositPool = 0;
        return depositPool;

    }

    @Override
    public String getDescription(int id) {
        for (Product product : productList) {
            return product.toString();
        }
        return null;
    }

    @Override
    public ArrayList<String> getProduct() {
        ArrayList<String> productInfo = new ArrayList<>();
        for (Product product : purchasedItems) {
            productInfo.add(purchasedItems.toString());
        }

        return productInfo;
    }

    public void addproduct() {
        productList.add(new Snacks("Chips", 27));
        productList.add(new Sandwich("beef and salad", 98));
        productList.add(new Drinks("Soda", 18));
    }
}
