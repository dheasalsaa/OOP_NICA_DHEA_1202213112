public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat prngkt = new Perangkat("Adata",6,1.9f);
        prngkt.informasi();
        System.out.println();

        Laptop lptp = new Laptop("Seagate",8,2.6f,true);
        lptp.informasi();
        lptp.openGame("Mobile Legend");
        lptp.Email("dheaa@gmail.com");
        lptp.Email("dheaa@gmail.com", "salsaa@gmail.com");
        System.out.println();

        Handphone hp = new Handphone ("Sandisk", 4, 2.5f, false);
        hp.informasi();
        hp.telepon(81234567);
        hp.SMS(812334455);
        hp.SMS(81234, 8123456);
        System.out.println();

    }
    
}
