package packA;

public class Programmer extends EmpTmp {
    public Programmer(String n, int exp, int sal) {
        super(n, exp, sal);
    }

    public void sayHi(String n) {
        System.out.println("hi from " + name + " " + n);
    }

    @Override
    public String toString() {
        return String.format("Programmer [ %s ]", super.toString());
    }

    public String coding() {
        return name + " is coding...";
    }
}