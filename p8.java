class Rectangle {
    int height, width;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void display() {
        System.out.println("Height: " + height + ", Width: " + width);
    }
}

public class p8{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(15, 25);

        r1.display();
        r2.display();
    }
}
