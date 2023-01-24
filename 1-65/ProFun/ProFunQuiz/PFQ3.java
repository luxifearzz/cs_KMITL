import java.util.Scanner;

public class PFQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numElement = sc.nextLine();
        int t = Integer.parseInt(numElement);
        int salary = 0;
        for (int c = 0; c < t; c++) {
            String ip = sc.nextLine();
            try {
                salary += Integer.parseInt(ip.split(" ")[2]);
            } catch (Exception e) {}
        }
        System.out.println(salary);
        sc.close();
    }
}