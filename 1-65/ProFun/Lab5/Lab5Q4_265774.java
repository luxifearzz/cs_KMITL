class Lab5Q4_265774 {
    public static void main(String[] args) {
        char [] vowel = {'a', 'e', 'i', 'o', 'u'};
        int indexCnt = -1;
        String s1 = "I am happy"; // 0 with s1 = s1.toLowerCase();
        //String s2 = "xyz"; // -1
        s1 = s1.toLowerCase();
        boolean isBreak = false;
        for (int i=0;i<s1.length();i++) {
            for (char element:vowel) {
                if (element == s1.charAt(i)) {
                    indexCnt = i;
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) break;
        }
        System.out.println(indexCnt);
    }
}