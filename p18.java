class Car {
    private String name;
    private int topSpeed;

    public Car(String name, int topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }
    public String toString() {
        return "Carname='" + name + "', topSpeed=" + topSpeed + " km/h";
    }
}

public class p18 {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari", 340);
        Car car2 = new Car("Lamborghini", 350);
        Car car3 = new Car("Bugatti", 400);
        Car car4 = new Car("McLaren", 330);
        Car car5 = new Car("Porsche", 320);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
