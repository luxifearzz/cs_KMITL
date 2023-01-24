class Lab7Q1_65774 {
    public static void main(String[] args) {
        int q1ans = factorial(7);
        System.out.println(q1ans);
    }

    static int factorial(int n) {
        int sum = 1;
        for (int i=n;i>0;i--) sum *= i;
        return sum;
    }
}