class Square {
    int Side;
    int area;
    int peri;
    public int sq_area(){
        area = Side*Side;
        System.out.println("The area of square is"+ area);
        return area;
    }
    public int sq_peri(){
        peri = 4*Side;
        System.out.println("perimeter is "+peri);

        return peri;
    }

}
class Rectangle{
    int side_a;
    int side_b;
   

    public int re_area(){
        return side_a*side_b;
    }
    public int re_peri(){ 
        return (side_a+side_b)+(side_a+side_b) ;
    }
}

public class oops_pract {
    public static void main(String[] args) {
        Square box1 = new Square();
         box1.Side= 5;
        box1.sq_area();
         box1.sq_peri();

         Rectangle box2 = new Rectangle();
         box2.side_a= 4;
         box2.side_b=6;
         System.out.println("Recatangle");
         System.out.println(box2.re_area());
         System.out.println(box2.re_peri());

    }
}
