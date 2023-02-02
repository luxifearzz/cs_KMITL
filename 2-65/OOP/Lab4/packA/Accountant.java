package packA;

public class Accountant extends Employee {
    private static String companyName = "berk ban jamkad";
    private int experience;
    private String specialty;

    public String tellProfit() {
        return String.format("%s's profit is %d. My salary is %d", companyName, (int) (Math.random() * 1000), salary);
    }

    @Override
    public String toString() {
        return String.format("Accountant [experience=%d, specialty=%s]", experience, specialty);
    }
    
    @Override
    public void sayHi() {
        System.out.printf("Accountant %s says hello%n", name);
    }    

    public static String tellMyRole() {
        return "I am an accountant at " + companyName;
    }        
    
}