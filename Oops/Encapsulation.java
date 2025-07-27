class Details{
    private String name,branch;
    private int rollno;
    public void setName(String name){
        this.name = name; 
    }
    public void setRollno(int rollno){
        this.rollno = rollno; 
    }
    public void setBranch(String branch){
        this.branch = branch; 
    }
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }
    public String getBranch(){
        return branch;
    }

}

public class Encapsulation {
    public static void main(String[] args){
        Details d = new Details();
        d.setName("chandana");
        d.setRollno(525);
        d.setBranch("cse");
        System.out.println("Name:"+d.getName());
        System.out.println("Rollno:"+d.getRollno());
        System.out.println("Branch:"+d.getBranch());
    }
    
}
