class First{
    int a = 25;
    First(){
        System.out.println("fc constructor");
    }
}
class Second extends First{
    int a = 22;
    Second(){
        System.out.println("sc constructor");
    }
    void display(){
        System.out.println(a);
        System.out.println(super.a);
    }
}


public class Supervar {
    public static void main(String[] args){
        Second s = new Second();
        s.display();
    }
}
