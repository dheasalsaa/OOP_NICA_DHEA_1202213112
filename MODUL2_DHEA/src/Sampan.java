public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya,int layar){
        super(jumlahKursi,biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi ini merupakan salah satu trasnportasi air dengan jumlah kursi sebanyak " + jumlahKursi + " dengan tarif Rp." + biaya + "." ); 
    }

    @Override
    public void berlayar(){
        System.out.println("Sampan dapat berlayar di laut lepas sejauh " +layar+ "km."); 
    }

    @Override
    public void berlabuh(){
        System.out.println("Sampan tidak dapat berlabuh jauh di laut lepas."); 
    }

    public void berlabuh(int jangkar){
        System.out.println(); 
    }
    
}
