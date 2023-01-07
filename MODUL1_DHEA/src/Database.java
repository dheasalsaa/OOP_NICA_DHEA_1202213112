import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    Scanner key = new Scanner(System.in);
    String input;

    public void show_menu() {
        System.out.println("=============================================");
        System.out.println("1. Menu");
        System.out.println("2. Pilih Menu");
        System.out.println("3. Exit");
        System.out.println("=============================================");
    }

    public String insert_menu() {
        System.out.println("Masukkan Pilihan : ");
        input = key.nextLine();

        return input;
    }

    public void Search(String search) {
        switch(search) {
            case "Bakso", "bakso":
                System.out.println("1. Bakso(Makanan) Rp. 10000");
                break;
            case "Es Teh", "es teh":
                System.out.println("2. Es Teh(Minuman) Rp. 5000");
                break;
            case "Brownies", "brownies":
                System.out.println("3. Brownies(Dessert) Rp. 15000");
                break;
            default:
                System.out.println("Pilihan tidak ada di menu");
        }
    }


}