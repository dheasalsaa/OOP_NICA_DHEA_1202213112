import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        String Nama, No_Hp;
        String search;

        Scanner key = new Scanner(System.in);
        Database database = new Database();

        System.out.println("Selamat Datang di Rsetoran EAD");
        System.out.println("Silahkan register terlebih dahulu");
        System.out.println("====================================");
        System.out.println("Nama : ");
        Nama = key.nextLine();
        System.out.println("No Handphone : ");
        No_Hp = key.nextLine();
        System.out.println("Register Success");
        System.out.println("Nama : " + Nama);
        System.out.println("No Handphone : " + No_Hp);

        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
    }
}