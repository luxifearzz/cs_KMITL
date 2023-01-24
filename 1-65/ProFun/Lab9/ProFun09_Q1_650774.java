import java.util.Arrays;

class ProFun09_Q1_650774 {
    public static void main(String[] args) {
        int[] data = { 0, 1, 0, 1, 1, 0, 0, 0, 1 };
        shake(data);
        System.out.println(Arrays.toString(data));
    }

    static void shake(int[] arr) {
        int b = arr.length-1;
        for (int i = 0; i <= arr.length/2; i++) {
            if (arr[i]==1) {
                while (arr[b]!=0) {
                    b--;
                    if (b < i) return;
                }
                int z = arr[i];
                arr[i] = arr[b];
                arr[b] = z;
            }
        }
    }
}