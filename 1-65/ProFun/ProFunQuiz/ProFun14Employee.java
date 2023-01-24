public class ProFun14Employee {
    String name;
    String dept;
    int salary;
    int yearStart;

    ProFun14Employee(String n, String d, int sal, int yr) {
        name = n;
        dept = d;
        salary = sal;
        yearStart = yr;
    }

    String getName() {
        return name;
    }

    String getDept() {
        return dept;
    }

    int getSalary() {
        return salary;
    }

    int getYearStart() {
        return yearStart;
    }

    public String toString() {
        return String.format("%s %s(%d) %d", dept, name, yearStart, salary);
    }
}