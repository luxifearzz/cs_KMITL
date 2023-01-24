import java.util.Scanner;

public class PFQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numElement = sc.nextLine();
        int t = Integer.parseInt(numElement);
        int min = Integer.MAX_VALUE;
        String ans = "";
        for (int c = 0; c < t; c++) {
            String ip = sc.nextLine();
            String[] ipArr = ip.split(" ");
            int salary = Integer.parseInt(ip.split(" ")[2]);
            if (salary < min) {
                ans = String.format("%s %s(%s) %d", ipArr[1], ipArr[0], ipArr[3], salary);
                min = salary;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}