package packA;

public class Client implements CanPay {
    private String name;
    private MemberTypeWithDiscount memberType;

    public Client() {}

    public Client(String n) {
        name = n;
        memberType = MemberTypeWithDiscount.None;
    }
    
    public void spend(int direction) {
        switch (direction) {
            case 1 :
                promoteMemberType();
                break;
            case -1 :
                demoteMemberType();
                break;
        }
        showMembershipStatus();
    }

    private void promoteMemberType() {
        switch (memberType) {
            case None :
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case SILVER :
                memberType = MemberTypeWithDiscount.GOLD;
                break;
            case GOLD :
                memberType = MemberTypeWithDiscount.PREMIUM;
                break;
        }
    }

    private void demoteMemberType() {
        switch (memberType) {
            case None :
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case GOLD :
                memberType = MemberTypeWithDiscount.SILVER;
                break;
            case PREMIUM :
                memberType = MemberTypeWithDiscount.GOLD;
                break;
        }
    }

    public void showMembershipStatus() {
        System.out.printf("You are now %s, %d%% discount on Product, %d%% on service%n", memberType, (int)(memberType.getProductDiscountRate() * 10), (int)(memberType.getServiceDiscountRate() * 10));
    }
}