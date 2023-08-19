interface bicycle{
    void speedup(int fast);
    void breakspeed(int breakup);
}
class cycle implements bicycle{
   public int speed = 7;
   public void speedup(int fast){
        speed = speed + fast;
    }
   public void breakspeed(int breakup){
        speed = speed - breakup;
    }
}
public class interfaces {
    public static void main(String[] args) {
        cycle myCycle = new cycle();
        myCycle.speedup(3);
        System.out.println("Current speed: " + myCycle.speed);
        
        myCycle.breakspeed(2);
        System.out.println("Current speed: " + myCycle.speed);
    }
}
