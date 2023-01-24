class Lab7Q2_65774 {
    public static void main(String[] args) {
        int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        int q2ans = maxElement(data);
        System.out.println(q2ans);
    }

    static int maxElement(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int element:arr) max = element > max ? element : max;
        return max;
    }
}