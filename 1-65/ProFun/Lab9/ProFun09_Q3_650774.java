import java.util.Arrays;

class ProFun09_Q3_650774 {
    public static void main(String[] args) {
        int[][] bMap = { { 0, 0, 9, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 9, 9, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 0, 9, 0, 0 },
                { 0, 9, 0, 0, 9, 9, 0, 0, 9, 9, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 9, 9, 0, 0, 0, 0 }
        };
        int[][] mMap = markMap(bMap);
        for (int i = 0; i < mMap.length; i++) {
            System.out.println(Arrays.toString(bMap[i]) + "\t" + Arrays.toString(mMap[i]));
        };
    }

    static int[][] markMap(int[][] bMap) {
        int[][] mMap = new int[bMap.length][];
        for(int i=0; i<bMap.length; i++) {
            mMap[i] = Arrays.copyOf(bMap[i], bMap[i].length);
        } // copy bMap to mMap
        for(int row=0; row<mMap.length; row++) {
            for(int col=0; col<mMap[0].length; col++) {
                if (mMap[row][col]==9) continue;
                for(int i=0; i<3; i++) {
                    for(int j=0; j<3; j++) {
                        try {
                            if (mMap[row+i-1][col+j-1]==9) mMap[row][col] += 1;
                        } catch(Exception e) {}
                    }
                }
            }
        }
        return mMap;
    }
}