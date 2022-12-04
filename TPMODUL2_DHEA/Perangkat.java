public class Perangkat {
    protected String Drive;
    protected int Ram;
    protected float Processor;

    public Perangkat(String Drive, int Ram, float Processor){
        this.Drive = Drive;
        this.Ram = Ram;
        this.Processor = Processor;
    }
    public void informasi(){
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe %s dengan RAM sebesar %d GB dan Processor secepat %.2f", Drive, Ram, Processor);
    }
}
