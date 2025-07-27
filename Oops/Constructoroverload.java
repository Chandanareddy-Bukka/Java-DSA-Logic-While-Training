class Constructoroverload {
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
    Constructoroverload(){
        name = "chan";
        rollno = 125;
        marks = 52.56;
        System.out.println("hello");
    }
     Constructoroverload(String n,int r,float d){
        name = n;
        rollno = r;
        marks = d;
        System.out.println("hello");
    }

public static void main(String[] args){
    Constructoroverload c1 = new Constructoroverload("chan",25,56.76f);
    c1.display();
    Constructoroverload c2 = new Constructoroverload();
    c2.display();
    
    

}
}
