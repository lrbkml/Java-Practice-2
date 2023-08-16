

class Circle {
  public int radius;
  Circle(int r){
    this.radius = r;
    System.out.println("radius of circle is"+r);
  }
 
   public double area(){
    return Math.PI*this.radius*this.radius;
   }
}
class Cylinder extends Circle{
    Cylinder(int h , int r){
       super(r);
this.height = h;
 System.out.printf("height and radius of cylinder is "+h +","+ +r +"\n");
    }

   public int height ;
   public double volume(){
    return Math.PI*this.radius*this.radius*this.height;
    
}

}

public class inheritance_prac3 {
    public static void main(String[] args) {
        Circle c = new Circle(20);
        // c.radius = 20;
        Cylinder cl = new Cylinder(50,40);
    //     cl.radius=22;
    //   cl.height = 35;
     System.out.println(c.area()); 

     System.out.println(cl.volume());
        
    }
}
