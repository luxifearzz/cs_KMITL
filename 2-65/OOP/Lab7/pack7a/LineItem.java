package pack7a;

public class LineItem {
    private Product product;
    private int quantity;
    private int buyPrice;

    public LineItem(Product prod, int q, int p) {
        product = prod;
        quantity = q;
        buyPrice = p;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getBuyPrice() {  // 13 : added manually
        return buyPrice;
    }

    public int calculateAmount() {  // 3
        return quantity * buyPrice;
    }

    @Override
    public String toString() {
        return quantity + " of " + product.getpName() + " @= " + buyPrice;
    }
}