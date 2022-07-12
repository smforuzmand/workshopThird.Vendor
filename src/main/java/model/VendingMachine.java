package model;

public interface VendingMachine {
public void addCurrency();
public int getBalanace();
public Product request();
public int endSession();
public String getDescription();
public String[] getProduct();
}