
class Circle {
  public int radius;
 
   public double area(){
    return Math.PI*this.radius*this.radius;
   }
}
class Cylinder extends Circle{
   public int height ;
   public double volume(){
    return Math.PI*this.radius*this.radius*this.height;
    
}

}

public class inheritance_prac2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 20;
        Cylinder cl = new Cylinder();
        cl.radius=22;
      cl.height = 20;
     System.out.println(c.area()); 
     System.out.println(cl.volume());
     System.out.println("...");
        
    }
}
