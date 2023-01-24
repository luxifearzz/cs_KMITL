import java.util.ArrayList;

class AcctList_650774 {
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
        ArrayList<Account_650774> result = new ArrayList<>();
        for(Account_650774 element:acctList) {
            if (element.getName().startsWith(c)) {
                result.add(element);
            }
        }
        return result;
    }

    ArrayList<Account_650774> balanceLessThan(int b) {
        ArrayList<Account_650774> result = new ArrayList<>();
        for(Account_650774 element:acctList) {
            if (element.getBalance() < b) {
                result.add(element);
            }
        }
        return result;
    }
}