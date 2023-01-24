public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("Ggg", "Vcondo");
        System.out.println(s1);
        System.out.println(s1.getAverageGrade());

        System.out.println();

        Clock c1 = new Clock(3, 0, 0);
        System.out.println(c1);
        c1.tick();
        System.out.println(c1);
        c1.setTime(7, 30, 59);
        c1.tick();
        System.out.println(c1);
        c1.setTime(23, 59, 59);
        c1.tick();
        System.out.println(c1);

        System.out.println();

        Clock2 c2 = new Clock2(3, "AM", 0, 0);
        System.out.println(c2);
        c2.tick();
        System.out.println(c2);
        c2.setTime(7, "AM", 30, 59);
        c2.tick();
        System.out.println(c2);
        c2.setTime(11, "AM", 59, 59);
        c2.tick();
        System.out.println(c2);
    }
}