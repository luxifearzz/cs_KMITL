package packA;

public class Salesperson extends EmpTmp {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignmentTarget) {
        super(n, exp, sal);
        target = assignmentTarget;
    }

    public Salesperson(String n, int exp) {
        super(n, exp, 0);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int setTarget() {
        return target;
    }

    public void setSalary() {
        // implement
        salary *= 1.1;
    }

    public void setSalary(int increasedAmount) {
        // implement
        salary += increasedAmount;
    }

    public String makeQuotation() {
        return String.format("Dear value customer, %d is my best offer.", (int) (Math.random()*1000));
    }

    @Override
    public String toString() {
        return String.format("Salesperson [target=%d %s ]", target, super.toString());
    }
}
