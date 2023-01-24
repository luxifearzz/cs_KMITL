package packA;

public class Programmer {
    private String name;
    protected int salary;
    private int experience;

    public Programmer(String n, int exp, int sal) {
        name = n;
        experience = exp;
        salary = sal;
    }

    public Programmer(String n, int exp) {
        name = n;
        experience = exp;
    }

    public Programmer(String n) {
        name = n;
    }

    public Programmer() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getSalary() {
        return salary;
    }

    public void setExperience(int exp) {
        experience = exp;
    }

    public int getExperience() {
        return experience;
    }

    public String toString() {
        return String.format("Programmer [name=%s, salary=%d, experience=%d]", name, salary, experience);
    }

    public void sayHi() {
        System.out.println("hi from " + name);
    }
}