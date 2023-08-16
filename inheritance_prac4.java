import java.util.Scanner;

class Rectangle{

    private int length;
    private int breadth;
    public int getlength(){
       return length;
    }
    public void setlength(int l){
        this.length = l;

    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int b) {
        this.breadth = b;
    }
    public double area(){
        return length*breadth;
    }
    

}
class Cuboid extends Rectangle{

    private int height ;
    public int getheight(){
        return height;
    }
    public void setheight(int h){
        this.height=h;
    }
    public int volume(){
        return  getBreadth()*getlength()* height;
    }

}

public class inheritance_prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle R1 = new Rectangle();
        Cuboid C = new Cuboid();
        // int bb = sc.nextInt();
        //  int ll = sc.nextInt();
       R1.setBreadth(20);
       R1.setlength(30);
       C.setheight(50);
    //    C.setBreadth(90);
    //    C.setlength(10);
       System.out.println(R1.area());
       System.out.println(C.volume());
       
     
    }
}
