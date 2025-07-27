class Tv{
    void on(){
        System.out.println("tv is on");
    }
    void changeChannel(){
        System.out.println("tv channel changed");

    }
}
class SmartTv extends Tv{
    @Override
    void on(){
        System.out.println("smart tv is on");
    }
    @Override
    void changeChannel(){
        System.out.println("Smart tv channel is changed");
    }
    void connectWifi(){
        System.out.println("wifi is connected");
    }
}


public class Polymorphism {
    public static void main(String[] args){
            Tv st = new SmartTv();
            st.on();
            st.changeChannel();
            
    }


}
