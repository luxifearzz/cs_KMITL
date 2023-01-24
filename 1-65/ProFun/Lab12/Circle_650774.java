public class Circle_650774 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        // create new circle with default radius
        System.out.println(c1);
        // set new radius to 3.0
        c1.setRadius(3.0);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());
    }
}

class Circle {
    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public String toString() {
        return "Cirle[radius=" + radius + "]";
    } 
}