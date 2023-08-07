class circle{
    private float radius;
    float pie = 3.14f;
    
    public float getradius(){
        return radius;
     }
    public void setradius(float r){
        radius = r;
    }
    public float cir_area(){
        float area = pie*radius*radius; 
        return area;
    }
}

public class access_mod_private_prac {
    public static void main(String[] args) {
        circle sample1 = new circle();
        sample1.setradius(9);
        System.out.println(sample1.cir_area());

    }
}
