import java.util.HashMap;

class CS6005Lab7 {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Punch", 10);
        menu.putIfAbsent("Espresso", 15);
        menu.putIfAbsent("Lemon Tea", 19);

        System.out.println("Listing menu content");
        int i = 0;
        for (var entry:menu.entrySet()) {
            String itemName = entry.getKey();
            int price = entry.getValue();
            System.out.printf("item %d %s %d%n", ++i, itemName, price);
        }

        System.out.println("Listing only menu names");      // Q1
        i = 0;
        for (var key:menu.entrySet()) {
            System.out.printf("menu %d : %s%n",++i, key.getKey());
        }
        System.out.println("Listing only menu prices");     // Q2
        i = 0;
        for (var val:menu.entrySet()) {
            System.out.printf("menu %d : %d%n",++i, val.getValue());
        }

        Order[] table1 = {  new Order("Lemon Tea", 2),
                            new Order("Punch", 3)       };

        System.out.printf("Table1[0].item %s and %d%n", table1[0].item, table1[0].quantity);

        System.out.print("Table1's amount due is ");
        int amount = 0;
        for (var into:table1)
            amount += menu.get(into.item) * into.quantity;
        System.out.println(amount);
    }
}

class Order {
    String item;
    int quantity;

    Order(String i, int q) {
        item = i;
        quantity = q;
    }
}