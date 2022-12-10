public class TransportasiAir {
    protected int jumlahKursi,biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi ini merupakan salah satu trasnportasi air dengan jumlah kursi sebanyak " + jumlahKursi + "dengan tarif Rp." + biaya + "." ); 
    }

    public void berlayar(){
        System.out.println(); 
    }

    public void berlabuh(){
        System.out.println(); 
    }
    
}
