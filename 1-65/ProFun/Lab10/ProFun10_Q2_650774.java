class ProFun10_Q2_650774 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 2, 4, 2};
        System.out.println(occurrences(data, 2));
    }

    public static int occurrences(int[] a, int n) {
        return occurrencesA(a, n, 0);
    }

    public static int occurrencesA(int[] a, int n, int idx) {
        int cnt = 0;
        if (idx==a.length) return 0;
        if (a[idx]==n) cnt++;
        cnt += occurrencesA(a, n, idx+1);
        return cnt;
    }
}