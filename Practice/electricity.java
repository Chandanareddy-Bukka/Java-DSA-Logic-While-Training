
import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double bill;
            double service=25.0;
            double gst;
            String cus_name=sc.nextLine();
            int cus_id=sc.nextInt();
            int units=sc.nextInt();
            double discount=0;
            double total_bill=0;
            if (units<=100){
                bill=units*1.5;
            }
            else if(units<=200){
                bill=150+(units-100)*2;
            }
            else if(units<=300){
                bill=350+(units-200)*3;
            }
            else{
                bill=650+(units-300)*5;
            }
            gst=(bill*5)/100;
            bill=bill+service+gst;
            
            if (bill>500){
                 discount=(bill*5)/100;
                 total_bill=bill-discount;
            }
            System.out.println("Customer Id:"+cus_id);
            System.out.println("Customer Name :"+cus_name);
            System.out.printf("Units consumed: %d\n", units);
            System.out.printf("Base bill: %.1f\n", bill);
            System.out.printf("GST (5 percent): %.1f\n", gst);
            System.out.printf("Service Charge: %.1f\n", service);
            System.out.printf("Discount: %.1f\n", discount);
            System.out.printf("Total bill: %.1f\n", total_bill);
        }

    }
}
