class Circle {
 
    public void info() {
        System.out.println("I am circle with radius ");
    }
}

class Cylinder extends Circle {

    public void info() {
        System.out.println("I am cylinder with radius ");
    }
}

public class inheritace_practise {
    public static void main(String[] args) {
        Circle obj = new Cylinder();
       obj.info();
    }
}
