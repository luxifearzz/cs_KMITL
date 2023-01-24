import java.util.Scanner;

class Inclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C = (F-32) / 9 * 5;
        System.out.println(C + " \uD83E\uDD20");    // + print cowboy 🤠
        sc.close();
    }
}