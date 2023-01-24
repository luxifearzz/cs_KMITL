import java.util.Arrays;

class ProFun08_Q3_650774 {
    public static void main(String[] args) {
        int[] data = { 5, 3, 8, 4, 10, 3, 1, 5, 9, 7, 0 };
        topK(data);
    }

    static void topK(int[] intArr) {
        int[] arr2 = intArr;
        int[] arr = new int[10];
        for (int element:arr2) {
            if (element != 0) {
                for (int i=0; i<arr.length; i++) {
                    if (element >= arr[i]) {
                        rightShiftInsert(arr, i, element);
                        break;
                    }
                }
            } else break;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void rightShiftInsert(int[] arr, int startIdx, int num) {
        for (int i=arr.length-1; i>startIdx; i--) arr[i] = arr[i-1];
        arr[startIdx] = num;
    }
}