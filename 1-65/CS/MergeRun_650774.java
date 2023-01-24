import java.util.Arrays;

public class MergeRun_650774 {
    public static void main(String[] args) {
        // int[] data = {2, 4, 6, 15, 7, 10, 13, 18, 3, 20, 21, 23, 1, 5, 8, 22};
        // mergeRun(data, 2, 2);
        int[] data = {2, 4, 6, 15, 7, 10, 13, 18, 3, 20, 21, 23, 1, 5, 8, 22, 2, 4, 6, 15, 7, 10, 13, 18, 3, 20, 21, 23, 1, 5, 8, 22, 2, 4, 6, 15, 7, 10, 13, 18, 3, 20, 21, 23, 1, 5, 8, 22, 2, 4, 6, 15, 7, 10, 13, 18, 3, 20, 21, 23, 1, 5, 8, 22};
        mergeRun(data, 4, 2);
    }

    static void mergeRun(int[] x, int p, int q) {
        int group = 2<<(p-1);
        int member = 2<<(q-1);
        int[] mergeArr = new int[x.length];
        System.arraycopy(x, 0, mergeArr, 0, x.length);
        do {
            int k = 0;
            for (int r = 0; r < group/2; r++) {
                int start = r * (2 * member);
                int mid = start + member;
                int[] left = new int[member];
                System.arraycopy(mergeArr, start, left, 0, member);
                int[] right = new int[member];
                System.arraycopy(mergeArr, mid, right, 0, member);
                int i=0, j=0;
                while (i < left.length && j < right.length) {
                    if (left[i] <= right[j]) {
                        mergeArr[k++] = left[i++];
                    } else {
                        mergeArr[k++] = right[j++];
                    }
                }
                while (i < left.length) {
                    mergeArr[k++] = left[i++];
                }
                while (j < right.length) {
                    mergeArr[k++] = right[j++];
                }
            }
            group /= 2;
            member *= 2;
        } while (group > 0);
        System.out.println(Arrays.toString(mergeArr));
    }
}