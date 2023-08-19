interface a {
    void meth1();
    void meth2();
}
interface b extends a {
    void meth3();
    void meth4();
}
interface c {
    void meth5();
    void meth6();
}
class Sampleclass implements b,c{
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth 2");
    }
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("meth 4");
    }
    public void meth5(){
        System.out.println("meth 5");
    }
    public void meth6(){
        System.out.println("meth 6");
    }

}

public class inheritance_interfaces {
    public static void main(String[] args) {
        Sampleclass s = new Sampleclass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
        c x = new Sampleclass();
        x.meth5();
        x.meth6();
        
        b y = new Sampleclass();
        y.meth2();
        y.meth4();
        a z = new Sampleclass();
        z.meth1();
        z.meth2();
    }
}
