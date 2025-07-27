class Suzuki{
    String name = "suzuki";
    void display(){
        System.out.println(name);
    }
}
class Innova extends Suzuki{
    int no = 525;
    void show(){
        System.out.println(name);
        System.out.println(no);
    }
}



public class Inheritance {
    public static void main(String[] args){
            Innova i = new Innova();
            i.show();
    
    }

}
