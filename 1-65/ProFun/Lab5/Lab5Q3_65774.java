class Lab5Q3_65774 {
    public static void main(String[] args) {
        int sum=0;
            for (int i=1;i<200;i++) {
                if (i%10==0) continue;
                sum += i;
            }
        System.out.println(sum);
    }
}