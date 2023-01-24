class Lab5Q5_465774 {
    public static void main(String[] args) {
        int n = 3;      // can change value
        for (int i=1;i<n+1;i++) {
            for (int row=4;row>0;row--) {
                for (int addspace=0;addspace<n-i;addspace++) {
                    System.out.print(" ");
                }
                for (int j=0;j<row-1;j++) {
                    System.out.print(" ");
                }
                for (int star=0;star<2*(4-row+i)-1;star++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        for (int k=0;k<3;k++) {
            for (int i=0;i<n+1;i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}