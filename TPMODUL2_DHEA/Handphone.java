public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String Drive, int Ram, float Processor, boolean fingerprint){
        super(Drive, Ram, Processor);
        this.fingerprint = fingerprint;
    }
    @Override
    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf("Handphone ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu Handphone ini juga memiliki fingerprint", Drive, Ram, Processor);
        } else{
            System.out.printf("Handphone ini memiliki Drive tipe %s dengan Ram sebesar %d GB dan Processor secepat %.2f Ghz. %nSelain itu Handphone ini tidak memiliki fingerprint", Drive, Ram, Processor);
        }
    }
    public void telepon(int no){
        System.out.printf("%nHandphone berhasil menyambungkan telepon ke No %s", no);
    }
    public void SMS(int no){
        System.out.printf("%nHandphone berhasil menyambungkan telepon ke No %s", no);
    }
    public void SMS(int no1, int no2){
        System.out.printf("%nHandphone berhasil menyambungkan telepon ke No %s", no1, no2);
    }   
}    
    