class Lab4Q4_65774 {
    public static void main(String[] args) {
        int [] arr = {0,0,0};
        int num = 1;
        int ansCount = 0;
        int sumOfFactor = 0;
        while (true) {
            sumOfFactor = 0;
            for (int factor=num/2;factor>0;factor--) 
                if (num % factor == 0) sumOfFactor += factor;
            if (sumOfFactor==num)  {
                arr[ansCount] = num;
                ansCount++;
                if (ansCount==3) break;
            }
            num++;
        }
        System.out.print("first 3 perfect numbers are : ");
        for (int element:arr) System.out.print(element + " ");
    }
}