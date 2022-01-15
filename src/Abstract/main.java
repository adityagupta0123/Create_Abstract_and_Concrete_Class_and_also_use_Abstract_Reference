package Abstract;

abstract class Super{
    public Super(){
        System.out.println("abstract super class");
    }
    void meth1(){
        System.out.println("meth1");
    }
    abstract void meth2();
}
class sub extends Super{
    public void meth2(){
        System.out.println("meth2");
    }
}

public class main {
    public static void main(String[] args) {
        Super s1;
        sub s2 =new sub();

    }
}
