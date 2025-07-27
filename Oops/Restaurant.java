class FoodItem {
    int quantity;
    String itemName, itemId;
    double unitPrice;

    FoodItem(String itemId, String itemName, int quantity, double unitPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    double calculateBill() {
        return 0.0;
    }

    void displayDetails() {
        
    }
}

class DineIn extends FoodItem {
    double serviceCharge;

    DineIn(String itemId, String itemName, int quantity, double unitPrice, double serviceCharge) {
        super(itemId, itemName, quantity, unitPrice);
        this.serviceCharge = serviceCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total = total - total * 0.10;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + serviceCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = 0;
        if (total > 1000) {
            discount = total * 0.10;
            total = total - discount;
        }

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Service Charge: " + serviceCharge);
        System.out.println("Subtotal: " + (unitPrice * quantity));
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

class Takeaway extends FoodItem {
    double packingCharge;

    Takeaway(String itemId, String itemName, int quantity, double unitPrice, double packingCharge) {
        super(itemId, itemName, quantity, unitPrice);
        this.packingCharge = packingCharge;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total = total - total * 0.10;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + packingCharge;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = 0;
        if (total > 1000) {
            discount = total * 0.10;
            total = total - discount;
        }

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Packing Charge: " + packingCharge);
        System.out.println("Subtotal: " + (unitPrice * quantity));
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

class Delivery extends FoodItem {
    double deliveryFee;

    Delivery(String itemId, String itemName, int quantity, double unitPrice, double deliveryFee) {
        super(itemId, itemName, quantity, unitPrice);
        this.deliveryFee = deliveryFee;
    }

    @Override
    double calculateBill() {
        double subtotal = unitPrice * quantity + deliveryFee;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        if (total > 1000) {
            total = total - total * 0.10;
        }
        return total;
    }

    @Override
    void displayDetails() {
        double subtotal = unitPrice * quantity + deliveryFee;
        double gst = subtotal * 0.05;
        double total = subtotal + gst;
        double discount = 0;
        if (total > 1000) {
            discount = total * 0.10;
            total = total - discount;
        }

        System.out.println("\nFood Item Record");
        System.out.println("ID: " + itemId);
        System.out.println("Name: " + itemName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Subtotal: " + (unitPrice * quantity));
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + discount);
        System.out.println("Total Bill: " + total);
    }
}

public class Restaurant {
    public static void main(String[] args) {
        FoodItem[] orders = new FoodItem[3];
        orders[0] = new DineIn("F101", "Paneer Butter Masala", 4, 250.0, 50.0);
        orders[1] = new Takeaway("F102", "Veg Biryani", 2, 180.0, 20.0);
        orders[2] = new Delivery("F103", "Chicken Pizza", 4, 300.0, 40.0);

        for(FoodItem order : orders){
            order.displayDetails();
        }

    }
}
