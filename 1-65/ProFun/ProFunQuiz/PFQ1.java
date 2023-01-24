import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PFQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numIp = sc.nextLine();
        int t = Integer.parseInt(numIp);
        List<String> list = new ArrayList<>();
        for (int c = 0; c < t; c++) {
            String ip = sc.nextLine();
            String[] sArr = ip.split(" ");
            list.add(sArr[0]);
        }
        System.out.println(list);
        sc.close();
    }
}