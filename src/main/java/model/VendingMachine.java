package model;

public interface VendingMachine {
public void addCurrency(int amount);
public int getBalanace();
public Product request(int id);
public int endSession();
public String getDescription(int id);
public String[] getProduct();
}