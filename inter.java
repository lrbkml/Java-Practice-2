
class Cellphone{
    //  Cellphone(){
    //     System.out.println(" i am cell phone");
    // }
    public void calls(){
        System.out.println("i do callings");
    }

}
interface Gps{
    void location();
}
interface Camera{
    void lense();
}
interface Media{
    void player();
}

class Smartphone extends Cellphone implements Gps,Camera,Media{

    public Smartphone(){
        System.out.println(" i am smartphone with this funcionality");
    }

    public void location(){
        System.out.println("i track location");
    }
    public void lense(){
        System.out.println("i act as camera");
    }
    public void player(){
        System.out.println("i play media");
    }
}

public class inter {
    public static void main(String[] args) {

        Smartphone s = new Smartphone();
        s.calls();
        s.lense();
        s.player();
        s.location();
        
    }
}

