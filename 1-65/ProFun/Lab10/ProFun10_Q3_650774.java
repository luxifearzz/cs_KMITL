import java.util.Arrays;

class ProFun10_Q3_650774 {
    public static void main(String[] args) {
        int[] data = {1, -2, 3, 4, -5};
        System.out.println(Arrays.toString(negativeToZero(data)));
    }

    public static int[] negativeToZero(int[] a) {
        int[] newArr = new int[a.length];
        return negativeToZeroA(a, newArr, 0);
    }

    public static int[] negativeToZeroA(int[] a, int[] newArr, int idx) {
        if (idx==a.length) return newArr;
        newArr[idx] = a[idx] < 0 ? 0 : a[idx];
        return negativeToZeroA(a, newArr, idx+1);
    }
}