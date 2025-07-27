interface First{
    abstract void sum();
}
interface Second extends First{
    abstract void sub();
}
interface Third extends Second{
    abstract void mul();
}
class Shin implements Third{
    public void sum(){
        System.out.println(1+2);
    }
    public void sub(){
        System.out.println(1-2);
    }
    public void mul(){
        System.out.println(1*7);
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Shin s = new Shin();
        s.sum();
        s.sub();
        s.mul();
    }
}
