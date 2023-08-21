
class Monkey{
    public void jump(){
        System.out.println("jump");
    }
    public void bite(){
        System.out.println("bite");
    }
}
    class Human extends Monkey implements BasicAnimal{
        
        public void study(){
            System.out.println("study");
        }
        public void eat(){
            System.out.println("eat");
        }
         public void sleep(){
            System.out.println("sleep");
        }
      
    }
    interface BasicAnimal{
        void eat();
        void sleep();
    }


public class practice_set_abstract_interfce {
    public static void main(String[] args) {
        Human h = new Human();
        h.sleep();
        Monkey m = new Human();
        m.bite();
        
       
    }
}
