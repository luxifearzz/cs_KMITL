import java.util.Scanner;

class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) System.out.println(100);
        else if (2 <= n && n <= 4) System.out.println(n * 98);
        else if (5 <= n && n <= 9) System.out.println(n * 95);
        else System.out.println(n * 90);
        sc.close();
    }
}