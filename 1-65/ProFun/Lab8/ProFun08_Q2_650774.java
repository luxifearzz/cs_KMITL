class ProFun08_Q2_650774 {
    public static void main(String[] args) {
        int[] q2Arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadane(q2Arr));
    }

    static int kadane(int[] arr) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for (int element:arr) {
            max_ending_here += element;
            max_so_far = (max_so_far < max_ending_here) ? max_ending_here : max_so_far;
            max_ending_here = (max_ending_here < 0) ? 0 : max_ending_here;
        }
        return max_so_far;
    }
}