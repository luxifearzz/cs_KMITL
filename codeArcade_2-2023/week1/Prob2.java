import java.util.Scanner;

class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String space = "";
        for (int i = 1; i <= n; i++) {
            System.out.print(space + i);
            space = " ";
        }
        sc.close();
    }
}