class First{
    int a,b;
    First(){
        System.out.println("FC constructor");
    }
    First(int x,int y){
        a=x;
        b=y;
    }
    void add(){
        System.out.println(a+b);
    }
}
class Second extends First{
    Second(){
        super(10,20);
        super.add();
        //System.out.println("sc constructor");
    }
}


public class Super {
    public static void main(String[] args){
        
        Second s = new Second();
        //s.add();
    }
}
