package pack7a;

import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private Map<String, Product> productList;
    private Map<String, Integer> priceList;

    public Catalog() {
        productList = new HashMap<>();
        priceList = new HashMap<>();
    }

    public void add(Product product, int price) {   // 3
        productList.putIfAbsent(product.getpName(), product);
        priceList.putIfAbsent(product.getpName(), price);
    }

    public void showCatalog() { // 6
        for(var pd:priceList.entrySet()) {
            System.out.println(pd.getKey() + " @ " + pd.getValue());
        }
    }

    public int getPrice(String productName) {   // 5
        return priceList.get(productName);
    }

    public Product getProduct(String productName) { // 4
        return productList.get(productName);
    }
}