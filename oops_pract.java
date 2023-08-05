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

public class oops_pract {
    public static void main(String[] args) {
        Square box1 = new Square();
         box1.Side= 5;
        box1.sq_area();
         box1.sq_peri();
    }
}
