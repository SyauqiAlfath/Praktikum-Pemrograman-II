
package PRAK202_2110817210020_MuhammadSyauqiAlfath;

public class Mobil {
    String merekMobil, tahunKeluaran;
    int kapasitasMobil, hargaMobil;
    private String pemilikMobil;
    
    void setPemilik (String pemilikMobil) {
        this.pemilikMobil = pemilikMobil;
    }
    
    String getPemilik() {
        return this.pemilikMobil;
    }
    
    String getPajak() {
        return String.format("%,d", (this.hargaMobil/100)*2);
    }
    
    public void Bengkel(){
        System.out.println("Merek Mobil    : " + merekMobil);
        System.out.println("Harga          : Rp. " + String.format("%,d", this.hargaMobil));
        System.out.println("Tahun keluaran : " + tahunKeluaran);
        System.out.println("Kapasitas      : " + kapasitasMobil + " cc");
        
    }
}
