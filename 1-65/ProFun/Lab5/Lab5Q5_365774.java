class Lab5Q5_365774 {
    public static void main(String[] args) {
        int n = 4;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<2*(i+1)-1;j++) {
                System.out.print("P");
            }
            System.out.println("");
        }
    }
}