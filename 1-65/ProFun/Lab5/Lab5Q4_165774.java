class Lab5Q4_165774 {
    public static void main(String[] args) {
        String str = "WWWWMMMMWMWMWMWMMMWWWWWM";
        int wCount = 0;
        int mCount = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i)=='W') wCount++;
            else mCount++;
        }
        System.out.println("Women : " + wCount);
        System.out.println("Men : " + mCount);
    }
}