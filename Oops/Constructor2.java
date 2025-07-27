class Constructor2{
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(marks);
    }
    Constructor2(String n,int r,double m){
        name = n;
        rollno = r;
        marks = m;
        
    }

public static void main(String[] args){
    Constructor2 c = new Constructor2("chan",25,54.67);
    c.display();

}
}
