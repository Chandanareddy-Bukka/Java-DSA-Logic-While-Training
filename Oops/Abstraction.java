abstract class First{
    int a,b;
    First(int x,int y){
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);

    }
    abstract void sub();
    abstract void mult();
}
class Second extends First{
    Second(){
        super(10,20);

    }
    void sub(){
        System.out.println(a-b);
    }
    void mult(){
        System.out.println(a*b);
    }
} 
public class Abstraction {
    public static void main(String[] args) {
        Second s = new Second();
        s.sum();
        s.sub();
        s.mult();
    }
}
