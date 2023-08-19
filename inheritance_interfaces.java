interface a {
    void meth1();
    void meth2();
}
interface b extends a {
    void meth3();
    void meth4();
}
class Sampleclass implements b{
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
}

public class inheritance_interfaces {
    public static void main(String[] args) {
        Sampleclass s = new Sampleclass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
