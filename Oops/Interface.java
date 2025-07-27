interface First{
    abstract void sum();
    abstract void mul();
}
class Second implements First{
    public void sum(){
        System.out.println(10+20);
    }
    public void mul(){
        System.out.println(10*20);
    }
}
public class Interface {
    public static void main(String[] args) {
        Second s = new Second();
        s.sum();
        s.mul();
    }
}
