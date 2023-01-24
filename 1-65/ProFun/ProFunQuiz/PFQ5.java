import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PFQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numElement = sc.nextLine();
        int t = Integer.parseInt(numElement);
        String[] ansArr = new String[t];
        List<String> list = new ArrayList<>();
        for (int c = 0; c < t; c++) {
            String ip = sc.nextLine();
            ansArr[c] = ip;
        }
        String dep = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String[] splArr = ansArr[i].split(" ");
            if (splArr[1].equals(dep)) {
                list.add(String.format("%s %s(%s) %s", splArr[1], splArr[0], splArr[3], splArr[2]));
            }
        }
        System.out.println(list);
        sc.close();
    }
}