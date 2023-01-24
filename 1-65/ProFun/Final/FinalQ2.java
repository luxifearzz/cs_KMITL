class FinalQ2 {
    public static void main(String[] args) {
        String mail1 = "sunthanadotauatkmitldotacdotth";
        System.out.println(emailConverter(mail1));
        String mail2 = "atdotdotatdot";
        System.out.println(emailConverter(mail2));
    }

    static String emailConverter(String a) {
        // String email = a.charAt(0); --> wrong!
        String email = String.valueOf(a.charAt(0));
        for (int i = 1; i < a.length(); i++) {
            if (i+1 < a.length()-1) {
                if (a.charAt(i) == 'a' && a.charAt(i+1) == 't') {
                    email += "@";
                    i += 1;
                    continue;
                }
            }
            if (i+2 < a.length()-1) {
                if (a.charAt(i) == 'd' && a.charAt(i+1) == 'o' && a.charAt(i+2) == 't') {
                    email += ".";
                    i += 2;
                    continue;
                }
            }
            email += a.charAt(i);
        }
        return email;
    }
}