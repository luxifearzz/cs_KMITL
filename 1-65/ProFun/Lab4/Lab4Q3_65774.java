class Lab4Q3_65774 {
    public static void main(String[] args) {
        int amountCharge = 0;
        int hrsPark = 0;
        for (int i = 0; i < args.length; i++) {
            hrsPark = Integer.parseInt(args[i]);
            int remaining = hrsPark;
            int days = hrsPark / 24;
            amountCharge = 24 * days;
            remaining %= 24;
            if (remaining>=18) amountCharge += 24;
            else if (remaining>=5) amountCharge += 10 + (remaining-4);
            else if (remaining>=3) amountCharge += (remaining-2) * 3 + 4;
            else if (remaining>0) amountCharge += 4;
            System.out.printf("parking for %d hrs, pay $%d.%n", hrsPark, amountCharge);
        }
    }
}