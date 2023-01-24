class Student {
    String name;
    String address;
    int[] grades = new int[30];

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return String.format("%s(%s)", name, address);
    }

    double getAverageGrade() {
        if (grades.length == 0) return 0;
        int sum = 0;
        for(int element:grades) sum += element;
        double avg = sum / grades.length;
        return avg;
    }
}