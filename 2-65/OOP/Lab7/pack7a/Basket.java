package pack7a;

import java.util.ArrayList;

public class Basket {
    private ArrayList<LineItem> items = new ArrayList<>();

    public void showItemsInBasket() {   // 14
        System.out.println("This basket contains");
        for(LineItem item:items) {
            System.out.printf("%d of %s @= %d%n", item.getQuantity(), item.getProduct().getpName(), item.getBuyPrice());
        }
    }

    public void putInBasket(LineItem item) {    // 7
        items.add(item);
    }

    public int printInvoice() { // 15 : change return type ( void -> int ) and return sum for calculate grandTotal in dailySalesReport
        System.out.println("invoice header");
        int sum = 0;
        for (LineItem line : items) {
            System.out.println(line.getProduct().getpName() + " x " + line.getQuantity() + " " + line.calculateAmount());
            sum += line.calculateAmount();
        }
        System.out.println("Total is " + sum + "******");
        return sum;
    }

    public void buyNow(LineItem item) { // 9
        ArrayList<LineItem> tmpItems = new ArrayList<>(items);
        items = new ArrayList<>();
        items.add(item);
        printInvoice();
        items = tmpItems;
    }
}