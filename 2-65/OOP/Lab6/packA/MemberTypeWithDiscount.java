package packA;

public enum MemberTypeWithDiscount {
    None(0, 0), SILVER(0.5, 0.5), GOLD(1.0, 2.0), PREMIUM(3.0, 4.5);

    private double productDiscountRate;
    private double serviceDiscountRate;

    private MemberTypeWithDiscount(double pDiscountRate, double sDiscountRate) {
        productDiscountRate = pDiscountRate;
        serviceDiscountRate = sDiscountRate;
    }

    public double getProductDiscountRate() {
        return productDiscountRate;
    }

    public double getServiceDiscountRate() {
        return serviceDiscountRate;
    }
}