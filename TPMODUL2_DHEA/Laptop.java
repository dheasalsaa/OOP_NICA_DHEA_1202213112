public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop (String Drive, int Ram, float Processor, boolean webcam){
        super(Drive, Ram, Processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        if (this.webcam == true) {
            System.out.printf("Laptop ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. Selain itu Laptop ini juga memiliki Webcam", Drive, Ram, Processor);
        } else {
            System.out.printf("Laptop ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. Selain itu Laptop ini tidak memiliki Webcam", Drive, Ram, Processor);
        }
    }
    public void openGame(String game_name){
        System.out.printf("Laptop berhasil membuka game %s %n", game_name);

    }
    public void Email(String email){
        System.out.printf("Laptop berhasil mengirim EMAIL ke %s %n",email);
    } 
    public void Email(String email1, String email2){
        System.out.printf("Laptop berhasil mengirim EMAIL ke %s dan ke %s %n", email1, email2);

    }
}
    

