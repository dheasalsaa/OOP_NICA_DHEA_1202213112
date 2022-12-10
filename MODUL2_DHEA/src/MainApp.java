public class MainApp {
    public static void main(String[] args) throws Exception {
        Sampan sampan1 = new Sampan(10,30000,3);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(2);

        Kapal kapal1 = new Kapal(20,15000,"Genset");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(3);
        kapal1.berlabuh();
    }

}
