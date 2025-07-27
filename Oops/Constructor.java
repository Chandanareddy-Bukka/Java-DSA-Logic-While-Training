class Constructor {
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }
    Constructor(){
        name = "chan";
        rollno = 125;
        marks = 52.56;
        System.out.println("hello");
    }

public static void main(String[] args){
    Constructor c = new Constructor();
    c.display();

}
}
