class Stud {
    String name;
    int num;

    Stud(String name) {
        this.name=name;
        System.out.println("your name="+name);
    }

    Stud(String name,int num) {
        this.name=name;
        this.num=num;
        System.out.println("your name="+name+"\nyour num="+num);
    }
}

public class p12 {
    public static void main(String[] args) {
       Stud s1=new Stud("Jeet");
       Stud s2=new Stud("Jeet",118);
    }
}
