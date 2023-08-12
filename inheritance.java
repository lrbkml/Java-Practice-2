 class Animal{

    int leg=4  ;
    int eyes =2 ;
    int mouth =1 ;
    String can_make_sound ="YES";

    

    public void setLeg(int leg) {
        this.leg = leg;
        System.out.println("I got 4 leg");
    }



    public void setEyes(int eyes) {
        this.eyes = eyes;
        System.out.println("I got 2 eyes");
    }



    public void setMouth(int mouth) {
        this.mouth = mouth;
        System.out.println("I got 1 mouth");
    }



    public void setCan_make_sound(String can_make_sound) {
        this.can_make_sound = can_make_sound;
        System.out.println("I can make sound");
    }



    public int getLeg() {
        return leg;
    }



    public int getEyes() {
        return eyes;
    }



    public int getMouth() {
        return mouth;
    }



    public String getcan_make_sound() {
        return can_make_sound;
    }



    Animal(){
           System.out.println("I am animal"); 
    }
 }

 class Dog extends Animal{

    String sound = "bark";

    public String getSound() {
        System.out.println("I bark");
        return sound;
    }
    

 }  

public class inheritance {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        
        System.out.println(a.getEyes());

          Dog d = new Dog();
          int x= d.getLeg();
          System.out.println(x);
          d.getSound();
    }
  
    
     
    
}
