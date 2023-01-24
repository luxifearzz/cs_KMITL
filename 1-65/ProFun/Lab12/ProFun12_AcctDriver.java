public class ProFun12_AcctDriver {
    public static void main(String[] args) {
        testAccount();
        testAcctList();
    }

    static void testAcctList() {
        AcctList_650774 clients = new AcctList_650774();
        String startWith = "c";
        System.out.println("List of account name start with " + startWith.toUpperCase());
        System.out.println(clients.filterName(startWith.toUpperCase()));
        int bound = 1400;
        System.out.println("List of account balance less than " + bound);
        System.out.println(clients.balanceLessThan(bound));
    }

    static void testAccount() {
        Account_650774 acct1 = new Account_650774(1, "melon", 1500);
        Account_650774 acct2 = new Account_650774(2, "rose apple", 2200);
        System.out.println(acct1.credit(700)); // 2200
        System.out.println(acct2.debit(300)); // 1900
        System.out.println(acct1.transferTo(acct2, 1000)); // 2200
        System.out.println(acct1.credit(-50)); // 1200
        System.out.println(acct2.debit(-50)); // 2900
        System.out.println(acct1);
        System.out.println(acct2);
    }
}

/* class AcctList_650774 {
    ArrayList<Account_650774> acctList;

    AcctList_650774() {
        acctList = new ArrayList<>();
        acctList.add(new Account_650774(1, "Cactus", 1000));
        acctList.add(new Account_650774(2, "Celsia", 500));
        acctList.add(new Account_650774(3, "Clove pink", 1500));
        acctList.add(new Account_650774(4, "Crown Imperial", 900));
        acctList.add(new Account_650774(5, "Daffodil", 1200));
        acctList.add(new Account_650774(6, "Daisy", 1700));
        acctList.add(new Account_650774(7, "Dandelion", 500));
        acctList.add(new Account_650774(8, "Dittany", 600));
    }

    ArrayList<Account_650774> filterName(String c) {
        ArrayList<Account_650774> result = null;
        return result;
    }

    ArrayList<Account_650774> balanceLessThan(int b) {
        ArrayList<Account_650774> result = null;
        return result;
    }
} */