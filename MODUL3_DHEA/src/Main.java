import java.util.Scanner;
import java.util.InputMismatchException;;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner (System.in);
        Calculation calculation = new Calculation();
        int menu;

        do {
            System.out.println("---Menu---\n1. Square\n2. Circle\n3. Trapezoid\n0. Exit");
            try {
                System.out.println("Please select menu : ");
                menu = input.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Enter the length of side the square : ");
                        double side = input.nextDouble();
                        calculation.setSquare(side);
                        calculation.run();
                        System.out.println("The result : "+calculation.getSquare());
                        break;

                    case 2:
                        System.out.println("Enter the radius of circle : ");
                        double radius = input.nextDouble();
                        calculation.setCircle(radius);
                        calculation.run();
                        System.out.println("The result : "+calculation.getCircle());
                        break;
                    
                    case 3:
                        System.out.println("Enter the upper7 of base of Trapezoid : ");
                        double upper = input.nextDouble();
                        System.out.println("Enter the lower side of Trapezoid : ");
                        double lower = input.nextDouble();
                        System.out.println("Enter the height of trapezoid : ");
                        double height = input.nextDouble();
                        calculation.setTrapezoid(upper,lower,height);
                        calculation.run();
                        System.out.println("The result : "+calculation.getTrapezoid());
                        break;
                    
                    case 0:
                        System.out.println("Program has ended.");
                        break;
                    default:
                        System.out.println("Not available");
                        continue;
                }
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("---ERROR : Input must be a number---");
                Scanner scanner;
                input.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (repeat);
        input.close();
    }
}
