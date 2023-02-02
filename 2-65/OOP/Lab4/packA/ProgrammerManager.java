package packA;

public class ProgrammerManager extends Programmer implements ManagerRoles{
    public ProgrammerManager(String n, int exp, int sal) {
        name = n;
        experience = exp;
        salary = sal;
    }

    @Override
    public void sayHi() {
        System.out.println("Coding in " + super.getSkills());
    }

    @Override
    public String coding() {
        return "coding from ProgrammerManager.";
    }

    @Override
    public int evaluate(Programmer p) {
        p.salary += (p.salary*15)/100.0;
        return p.salary;
    }

    @Override
    public String toString() {
        return String.format("ManagerProgrammer [name=%s, experience=%d, salary=%d]", name, experience, salary);
    }
}