class Emp {
    private int id ;
    private String name;

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
      public int getid(){
        return id;
    }
    public void setid(int i){
        id = i;
    }
}
public class Acces_modifier {
 public static void main(String[] args) {
    Emp user1 = new Emp();
        user1.setname("Laraib");
        System.out.println(user1.getname());
        
    
 }   
}
