package model;

import java.util.ArrayList;

public interface VendingMachine {
public void addCurrency(int amount);
public int getBalance();
public Product request(int id);
public int endSession();
public String getDescription(int id);
ArrayList<String> getProduct();
}