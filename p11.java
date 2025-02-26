class Shape {
    void area(float radius) {
        double circleArea = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
    void area(float length, float width) {
        double rectangleArea = length * width;
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}

public class p11{
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(5.0f);
        shape.area(10.0f, 4.0f);
    }
}
