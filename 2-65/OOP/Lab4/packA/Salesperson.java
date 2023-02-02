package packA;

public class Salesperson extends Employee implements SalesRoles {
    private int target;

    public void sayHi() {
        System.out.printf("Salesperson %s says hi!%n", name);
    }
    
    public void setSalary() {
        salary *= 1.1;
    }

    public void setSalary(int incAmount) {
        salary += incAmount;
    }

    public String makeQuotation() {
        return String.format("Dear value customer, %d is my best offer.", (int) (Math.random()*1000));
    }

    @Override
    public String toString() {
        return String.format("Salesperson [target=%d %s ]", target, super.toString());
    }
}
