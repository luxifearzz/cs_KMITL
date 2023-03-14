package pack7a;

import java.util.ArrayList;

public class Shop {
    private String name;
    private Catalog catalog = new Catalog();
    private ArrayList<Basket> ordersToday = new ArrayList<>();

    public Shop(String n) {
        name = n;
        catalog.add(new Drink("mix veggies", "refreshing"), 22);
        catalog.add(new Drink("lactasoy", "less hungry"), 15);
        catalog.add(new Noodles("mama", "classic"), 9);
        catalog.add(new Noodles("korean", "i can afford"), 33);
        // duplicate won't update
        catalog.add(new Noodles("mama", "duplicate"), 11);
        showCatalog();
    }

    private void showCatalog() {    // 7
        System.out.println("Welcome to " + name);
        catalog.showCatalog();
    }

    public Basket newCustomerArrives() {    // 1
        return new Basket();
    }

    public LineItem generateLineItem(String pName, int q) { // 8 : add to UML
        LineItem tmpLineItem = new LineItem(catalog.getProduct(pName), q, catalog.getPrice(pName));
        return tmpLineItem;
    }

    public LineItem generateBuyNowItem(String pName) {  // 10
        LineItem tmpLineItem = new LineItem(catalog.getProduct(pName), 1, catalog.getPrice(pName));
        Basket tmpBasket = new Basket();
        tmpBasket.putInBasket(tmpLineItem);
        ordersToday.add(tmpBasket);
        return tmpLineItem;
    }

    public void getPayment(Basket b) {  // 12
        System.out.println("I am cashier");
        b.printInvoice();
        ordersToday.add(b);
    }

    public void dailySalesReport() {    // 16
        System.out.println("Sales Report for " + name);
        System.out.println("  ---------");
        int nBasket = 1;
        int sum = 0;
        for(Basket b:ordersToday) {
            System.out.println("Basket " + nBasket++);
            sum += b.printInvoice();
            System.out.println("  ----------");
        }
        System.out.println("Grand Total is " + sum + "******");
    }
}