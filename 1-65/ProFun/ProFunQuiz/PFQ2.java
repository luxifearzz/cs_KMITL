import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PFQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        String numElement = sc.nextLine();
        int t = Integer.parseInt(numElement);
        for (int c = 0; c < t; c++) {
            String ip = sc.nextLine();
            String[] ipArr = ip.split(" ");
            int startYear = Integer.parseInt(ipArr[3]);
            if (startYear < 2015) result.add(String.format("%s %s(%d) %s", ipArr[1], ipArr[0], startYear, ipArr[2]));
        }
        System.out.println(result);
        sc.close();
    }
}