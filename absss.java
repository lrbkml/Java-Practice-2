public abstract class abs{
    public abs(){
        System.out.println("const from abs");
    }
}
public class test extends abs{
   public static void main(String[] args){
    abs obj = new test() {
        
    };
   }

}

public class absss {
     {
        
    }
}
