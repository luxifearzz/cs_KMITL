package packA;

public class Salesperson extends Programmer {
    private int target;

    public Salesperson(String n, int exp, int sal, int assignedTarget) {
        super(n, exp, sal);
        target = assignedTarget;
    }

    public Salesperson(String n, int exp) {
        super(n, exp);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }

    public void setSalary() {
        super.salary *= 1.1;
    }

    @Override
    public void setSalary(int incresedAmount) {
        super.salary += incresedAmount;
    }

    public String makeQuotation() {
        return String.format("Dear value customer, %d is my best offer.", (int) (Math.random()*1000));
    }

    @Override
    public String toString() {
        return String.format("Salesperson [target=%d %s ]", target, super.toString());
    }

    
}