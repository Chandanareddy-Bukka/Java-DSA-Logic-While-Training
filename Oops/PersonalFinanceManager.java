import java.util.*;

// Abstract class for common structure
abstract class Record {
    protected int id;
    protected String description;
    protected double amount;
    protected String date;
    protected String category;

    public Record(int id, String description, double amount, String date, String category) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category.toLowerCase(); // Normalize category
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }

    public abstract void display();
}

// Income class
class Income extends Record {
    public Income(int id, String description, double amount, String date, String category) {
        super(id, description, amount, date, category);
    }

    @Override
    public void display() {
        System.out.println("Income ID: " + id + ", Description: " + description + ", Amount: Rs" + amount + ", Date: " + date + ", Category: " + category);
    }
}

// Expense class
class Expense extends Record {
    public Expense(int id, String description, double amount, String date, String category) {
        super(id, description, amount, date, category);
    }

    @Override
    public void display() {
        System.out.println("Expense ID: " + id + ", Description: " + description + ", Amount: Rs" + amount + ", Date: " + date + ", Category: " + category);
    }
}

// Main Manager Class
public class PersonalFinanceManager {
    static Scanner sc = new Scanner(System.in);
    static Arraylist<Record> records = new Arraylist<>();
    static Map<String, Double> budgetLimits = new HashMap<>();
    static int idCounter = 1;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Smart Personal Finance Manager ---");
            System.out.println("1. Add Record");
            System.out.println("2. View Records");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Record");
            System.out.println("5. Set Budget Limit");
            System.out.println("6. Monthly Report");
            System.out.println("7. Net Balance");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addRecord(); break;
                case 2: viewRecords(); break;
                case 3: updateRecord(); break;
                case 4: deleteRecord(); break;
                case 5: setBudgetLimit(); break;
                case 6: monthlyReport(); break;
                case 7: netBalance(); break;
                case 0: System.out.println("Exiting...Thankyou"); break;
                default: System.out.println("Invalid option!");
            }
        } while (choice != 0);
    }

    static void addRecord() {
        System.out.print("Enter Type (income/expense): ");
        String type = sc.nextLine().toLowerCase();
        System.out.print("Enter Description: ");
        String desc = sc.nextLine();
        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = sc.nextLine();
        System.out.print("Enter Category (e.g. food, salary, rent): ");
        String category = sc.nextLine().toLowerCase();

        Record rec = null;
        if (type.equals("income")) {
            rec = new Income(idCounter++, desc, amt, date, category);
        } else if (type.equals("expense")) {
            rec = new Expense(idCounter++, desc, amt, date, category);
        } else {
            System.out.println("Invalid type.");
            return;
        }

        records.add(rec); // Add record first

        if (type.equals("expense")) {
            checkBudget(category); // Check budget after adding
        }

        System.out.println(type + " added successfully.");
    }

    static void viewRecords() {
        if (records.isEmpty()) {
            System.out.println("No records found.");
            return;
        }

        for (Record r : records)
            r.display();
    }

    static void updateRecord() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Record r : records) {
            if (r.getId() == id) {
                System.out.print("New Description: ");
                r.description = sc.nextLine();
                System.out.print("New Amount: ");
                r.amount = sc.nextDouble();
                sc.nextLine();
                System.out.print("New Date: ");
                r.date = sc.nextLine();
                System.out.print("New Category: ");
                r.category = sc.nextLine().toLowerCase();

                System.out.println("Record updated.");

                if (r instanceof Expense) {
                    checkBudget(r.getCategory());
                }

                return;
            }
        }
        System.out.println("Record not found.");
    }

    static void deleteRecord() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        Iterator<Record> it = records.iterator();
        while (it.hasNext()) {
            Record r = it.next();
            if (r.getId() == id) {
                it.remove();
                System.out.println("Record deleted.");

                // Re-check budget if expense deleted
                if (r instanceof Expense) {
                    checkBudget(r.getCategory());
                }
                return;
            }
        }
        System.out.println("Record not found.");
    }

    static void setBudgetLimit() {
        System.out.print("Enter Category (e.g. groceries, rent): ");
        String category = sc.nextLine().toLowerCase();
        System.out.print("Enter Budget Limit: ");
        double limit = sc.nextDouble();
        sc.nextLine();
        budgetLimits.put(category, limit);
        System.out.println("Budget limit set for " + category);
    }

    static void checkBudget(String category) {
        double total = 0;
        for (Record r : records) {
            if (r instanceof Expense && r.getCategory().equalsIgnoreCase(category)) {
                total += r.getAmount();
            }
        }

        if (budgetLimits.containsKey(category) && total > budgetLimits.get(category)) {
            double over = total - budgetLimits.get(category);
            System.out.println(" Warning: Budget exceeded for category '" + category + "' by Rs" +" "+ over);
        }
    }

    static void monthlyReport() {
        double income = 0, expense = 0;
        Map<String, Double> catExpense = new HashMap<>();

        for (Record r : records) {
            if (r instanceof Income) income += r.getAmount();
            else {
                expense += r.getAmount();
                catExpense.put(r.getCategory(),
                    catExpense.getOrDefault(r.getCategory(), 0.0) + r.getAmount());
            }
        }

        System.out.println("Total Income: \u20B9" + income);
        System.out.println("Total Expense: \u20B9" + expense);
        System.out.println("Expense by Category:");
        for (String cat : catExpense.keySet()) {
            System.out.println(" - " + cat + ": Rs" +" "+catExpense.get(cat));
        }
    }

    static void netBalance() {
        double income = 0, expense = 0;
        for (Record r : records) {
            if (r instanceof Income) income += r.getAmount();
            else expense += r.getAmount();
        }
        System.out.println("Net Balance = Rs" +" "+ (income - expense));
    }
}
