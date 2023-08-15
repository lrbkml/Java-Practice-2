class one {
    public void greet(){
        System.out.println("Hello i am class one ");
    }
}
class two extends one{
    public void greet(){
        System.out.println("Hello i am class two");
    }
}

public class dynamic_dispactch {
    public static void main(String[] args) {
        one obj = new two();
        obj.greet();
        
    }
}
