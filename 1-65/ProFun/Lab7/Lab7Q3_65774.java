class Lab7Q3_65774 {
    public static void main(String[] args) {
        numDaysFromDate(3, 1, 2004, 6); // Saturday 3rd January 2004
    }

    static void numDaysFromDate(int date, int month, int year, int myBD) {
        int daysBornTil31Dec2021 = 0;
        // your code
        int [] numDaysArr = {31, (year%4==0 && (year%100!=0 || year%400==0)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfFirstMonth = numDaysArr[month-1];
        daysBornTil31Dec2021 += dayOfFirstMonth - date;
        for (int i=month+1;i<=12;i++) {
            daysBornTil31Dec2021 += numDaysArr[i-1];
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
}