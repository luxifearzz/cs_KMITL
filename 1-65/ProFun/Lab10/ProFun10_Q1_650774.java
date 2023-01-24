class ProFun10_Q1_650774 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        System.out.println(appearsIn(data, 2));
    }

    public static boolean appearsIn(int[] a, int n) {
        return appearsInA(a, n, 0);
    }

    public static boolean appearsInA(int[] a, int n, int idx) {
        if (idx==a.length) return false;
        if (a[idx]==n) return true;
        return appearsInA(a, n, idx+1);
    }
}