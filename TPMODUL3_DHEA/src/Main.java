import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant rest = new Restaurant();
            int customerID, orderQty;
            try {
                System.out.println("Input customer ID: ");
                customerID = input.nextInt();

                System.out.println("Input how much food do you want: ");
                orderQty = input.nextInt();

                Thread td1 = new Thread(rest);
                Waiter waiter = new Waiter(customerID, orderQty);
                Thread td2 = new Thread(waiter);

                td1.start();
                td2.start();
                td1.join();
                td2.join();
            } catch (Exception e) {
                System.out.println("Your input must be integer \n");
            }
        }

    }
}