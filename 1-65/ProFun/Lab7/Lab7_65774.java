class Lab7_65774 {
    public static void main(String[] args) {
        //q1
        int q1ans = factorial(7);
        System.out.println(q1ans);

        //q2
        int [] data = {7, 1, 2, -1, 3, 4, 10, -12, 3, 21, -9};
        int q2ans = maxElement(data);
        System.out.println(q2ans);

        //q3
        numDaysFromDate(3, 1, 2004, 6); // Saturday 3rd January 2004
    }

    static int factorial(int n) {
        int sum = 1;
        for (int i=n;i>0;i--) sum *= i;
        return sum;
    }

    static int maxElement(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int element:arr) max = element > max ? element : max;
        return max;
    }

    static void numDaysFromDate(int date, int month, int year, int myBD) { 
        int daysBornTil31Dec2021 = 0;
        // your code
        int dayOfFirstMonth = numDaysSwitch(month, year);
        daysBornTil31Dec2021 += dayOfFirstMonth - date;
        for (int i=month+1;i<=12;i++) {
            daysBornTil31Dec2021 += numDaysSwitch(i, year);
        }
        for (int i=year+1;i<=2021;i++) {
            daysBornTil31Dec2021 += (i%4==0 && (i%100!=0 || i%400==0)) ? 366 : 365;
        }

        int daysBornTil2Jan2022 = daysBornTil31Dec2021 + 2 ; // shift to Sunday Jan 02 2022
        String str = showResult(date, month, year, myBD, daysBornTil2Jan2022);
        System.out.println(str);
    }

    static String showResult(int date, int month, int year, int myBD, int fromNumDaysFromDate) {
        String[] dayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int dayFromSun = 0;
        // int modResult = fromDateFromDate % 7; //??
        // your code
        int modResult = fromNumDaysFromDate % 7;
        dayFromSun = 7 - modResult;
        
        String str = String.format("You were born on %s and have been born for %d days (2 Jan 2022). Your program says %s", dayName[myBD], fromNumDaysFromDate, dayName[dayFromSun]);
        return str;
    }

    static int numDaysSwitch(int month, int year) {
        int days = 0;
            switch(month) {
            case 1: case 3: case 5: case 7: case 8:case 10:case 12: {
                    days = 31;
                    break;
                } case 2: { 
                    days = (year%4==0 && (year%100!=0 || year%400==0)) ? 29 : 28;
                    break;
                } case 4: case 6: case 9: case 11: {
                    days = 30;
                    break;
                }
            }
        return days;
    }
}