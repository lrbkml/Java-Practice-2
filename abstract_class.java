abstract class Parent{
    public void greet3(){
        System.out.println("greet 3 no abstract");
    }
   abstract public void greet();
   abstract public void greet2();
}
class child1 extends Parent{
   public void greet(){
        System.out.println("good morning ");

    }
   public void greet2(){
        System.out.println("heyy");
    }

}




public class abstract_class {
    public static void main(String[] args) {
     child1 ch = new child1();
     ch.greet();
     ch.greet2();
     ch.greet3();
    }
}
