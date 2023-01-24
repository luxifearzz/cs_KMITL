import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PFQ3Con {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<ProFun14Employee> eList;
        eList = getInput();

        List<String> list = eList.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(list);
        
        int yearThreshold = 2015;
        List<ProFun14Employee> empBefore2015;
        empBefore2015 = eList.stream().filter(e -> e.getYearStart() < yearThreshold).collect(Collectors.toList());
        System.out.println(empBefore2015);

        int x = eList.stream().collect(Collectors.summingInt(ProFun14Employee::getSalary));
        System.out.println(x);

        ProFun14Employee emp;
        emp = eList.stream().min(Comparator.comparing(ProFun14Employee::getSalary)).get();
        System.out.println(emp);

        String deptName = "IT";
        List<ProFun14Employee> result = eList.stream().filter(e -> e.getDept().equals(deptName)).collect(Collectors.toList());
        System.out.println(result);
    }

    static List<ProFun14Employee> getInput() {
        String tc = sc.nextLine();
        int t = Integer.parseInt(tc);
        List<ProFun14Employee> eList = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String ip = sc.nextLine();
            String[] ipArr = ip.split(" ");
            String name = ipArr[0];
            String dept = ipArr[1];
            int sal = Integer.parseInt(ipArr[2]);
            int yr = Integer.parseInt(ipArr[3]);
            eList.add(new ProFun14Employee(name, dept, sal, yr));
        }
        return eList;
    }
}
