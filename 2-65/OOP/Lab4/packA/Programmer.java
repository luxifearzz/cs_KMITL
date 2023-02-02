package packA;

import java.util.ArrayList;

public class Programmer extends Employee {
    private ArrayList<String> skills;

    public Programmer() {}

    public Programmer(String n, int exp, int sal) {
        name = n;
        experience = exp;
        salary = sal;
    }

    @Override
    public void sayHi() {
        System.out.printf("hi from Programmer %s%n", name);
    }

    public String coding() {
        return String.format("Programmer %s is coding", name);
    }

    @Override
    public String toString() {
        return String.format("Programmer [skills=%s]", skills.toString());
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

}