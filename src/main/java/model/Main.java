package model;

public class Main {

    public static void main(String[] args) {
        VendingMachineImpl alfa = new VendingMachineImpl();
        alfa.addproduct();
        alfa.addCurrency(10);
        System.out.println(alfa.getBalance());
        alfa.request(1);
        alfa.request(2);
        alfa.request(3);
        System.out.println(alfa.getProduct());
        System.out.println(alfa.getDescription(1));

    }
}