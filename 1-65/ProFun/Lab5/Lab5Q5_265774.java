class Lab5Q5_265774 {
    public static void main(String[] args) {
        int n = 4;
        for (int i=0;i<n;i++) {
            int m = n;
            for (int j=0;j<i+1;j++) {
                System.out.print(m-- + " ");
            }
            System.out.println("");
        }
    }
}