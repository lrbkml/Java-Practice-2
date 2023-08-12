class Parent{
    Parent(){
        System.out.println("i am parent with no para");
    }
    Parent(int x){
        System.out.println("I am parent with "+x);
    }
}
class Child extends Parent{
    Child(){
        super(10);
        System.out.println("i am child no para");
    }
    Child(int y){
        System.out.println(y);
    }
}

public class const_in_inheritance {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
