import java.util.Scanner;
class Lab4Q2_65774 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st_max_price = Integer.MIN_VALUE;
        int nd_max_price = Integer.MIN_VALUE;
        int x;
        for (int i=0;i<3;i++) {
            x = sc.nextInt();
            if (x>st_max_price) { 
                nd_max_price = st_max_price;
                st_max_price = x;
            } else if (x>nd_max_price) nd_max_price = x;
        }
        int price = st_max_price + nd_max_price;
        System.out.println(price);
        sc.close();
    }
}