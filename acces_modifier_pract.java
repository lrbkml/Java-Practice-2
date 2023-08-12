import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;
    
  
    public Cylinder(int radius, int height) {
        this.radius =  radius;
        this.height = height ;
        
       
    }

    
    public Cylinder() {
        this.radius =10  ;
        this.height = 20;
    }


    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

      public double SurfaceArea(){
        return 2*3.14*radius*height + 2*3.14*radius*radius;
        
    }


}
public class acces_modifier_pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder cl1 = new Cylinder(30 ,20);
      
       // int h = sc.nextInt();
       // int r = sc.nextInt();
      // cl1.setHeight(h);
      // cl1.setRadius(r);
       
       System.out.printf("radius is "+cl1.getRadius()+"\n"); 
        System.out.printf("Height is "+cl1.getHeight()+"\n");
        System.out.println(cl1.SurfaceArea());

        
        
    }
}
