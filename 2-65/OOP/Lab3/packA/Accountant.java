package packA;

public class Accountant extends EmpTmp {
    private static String companyName = "berk ban jamkad";
    private int experience;
    private String specialty;

    public Accountant(String name, int superExp, int experience, int sal, String talent) {
        super(name, experience, sal);
        this.experience = experience;
        specialty = talent;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setAccountExperience(int exp) {
        experience = exp;
    }

    public int getAccountExperience() {
        return experience;
    }

    public String tellProfit() {
        return String.format("%s's profit is %d. My salary is %d", companyName, (int) (Math.random() * 1000), super.salary);
    }

    @Override
    public String toString() {
        return String.format("Accountant [experience=%d, specialty=%s]", experience, specialty);
    }
    
    @Override
    public void sayHi() {
        System.out.printf("%s says hello%n", super.getName());
    }    

    public static String tellMyRole() {
        return "I am an accountant at " + companyName;
    }        
    
}