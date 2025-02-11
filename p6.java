class Student {
    String enr, name;

    Student(String enr, String name) {
        this.enr = enr;
        this.name = name;
    }

    void display() {
        System.out.println(name);
        System.out.println(enr);
    }
}

public class p6{
    public static void main(String[] args) {
        Student s1 = new Student("ENR001", "John");
        Student s2 = new Student("ENR002", "Alice");
        Student s3 = new Student("ENR003", "Bob");

        s1.display();
        s2.display();
        s3.display();
    }
}
