public class Coin_650774 {
    public static void main(String[] args) {
        Coin c1 = new Coin("Blue", "White");
        System.out.println(c1.getcolor());
        c1.setColor("Pink");
        System.out.println(c1.getcolor());
        c1.flip();
        System.out.println(c1.getcolor());
        c1.setColor("Purple");
        c1.flip();
        System.out.println(c1.toString());
    }
}

class Coin {
    String colorHead = "red";
    String colorTail = "red";

    Coin() {}

    Coin(String colorHead) {
        this.colorHead = colorHead;
    } 

    Coin(String colorHead, String colorTail) {
        this.colorHead = colorHead;
        this.colorTail = colorTail;
    }

    String getcolor() {
        return colorHead;
    }

    void setColor(String color) {
        this.colorHead = color;
    }

    void flip() {
        String z = colorHead;
        colorHead = colorTail;
        colorTail = z;
    }

    public String toString() {
        return "Coin[color head = "+colorHead+", color tail = "+colorTail+"]";
    }
}