class CS6005Lab6 {
    public static void main(String[] args) {
        char[] labels = {'a', 'b', 'c', 'd'};
        int[] values = {20, 30, 5, 10};
        int[] weights = {2, 5, 10, 5};
        double[] perW = new double[values.length];
        boolean[] isPicked = new boolean[values.length];
        int C = 16;
        int sumV = 0;
        int sumW = 0;
        
        // System.out.println(Arrays.toString(isPicked));
        for (int i=0; i<values.length; i++)
            perW[i] = (double) values[i] / weights[i];
        int k = 0;
        while (k<values.length) {
            if (sumW + weights[k] <= C) {
                isPicked[k] = true;
                sumW += weights[k];
                sumV += values[k];
            }
            k++;
        }
        System.out.print("Pick ");
        for (int i = 0; i < values.length; i++) {
            if (isPicked[i]) System.out.print(labels[i] + " ");
        }
        System.out.println();
        System.out.printf("sum values is %d sum weight is %d%n", sumV, sumW);
    }
}