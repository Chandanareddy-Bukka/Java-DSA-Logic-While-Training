abstract class First{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
}
abstract class Second extends First{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    abstract void mul(int a,int b);
}
class Third extends Second{

    void mul(int a,int b){
        System.out.println(a*b);
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Third t = new Third();
        t.sum(1,2);
        t.mul(25,1);
    }
}
