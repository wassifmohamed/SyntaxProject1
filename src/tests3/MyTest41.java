package tests3;

public class MyTest41 {

    public static void main(String[] args) {


    Boolean tables_in_stock = true;
    int orders_made = 0;

    while (tables_in_stock) {
        orders_made++;
        if (orders_made == 5) {
            System.out.println("We are out of stock.");
            break;
        } else {
            int tables_left = 5 - orders_made;
            String message = "There are " + tables_left + " tables in stock.";
            System.out.println(message);
        }
    }

    }
}
