class Lab5Q5_165774 {
    public static void main(String[] args) {
        int n = 10;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (i==j || i==n-j-1) System.out.print(" ");
                else System.out.print("X");
            }
            System.out.println("");
        }
    }
}