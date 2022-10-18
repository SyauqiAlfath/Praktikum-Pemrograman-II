
package PRAK202_2110817210020_MuhammadSyauqiAlfath;

public class Soal2Main {

    public static void main (String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merekMobil = "Toyota Raize";
        mobil1.tahunKeluaran = "2021";
        mobil1.kapasitasMobil = 988; 
        mobil1.hargaMobil = 202700000;
        
        mobil1.Bengkel();
        mobil1.setPemilik("Kasel");
        System.out.println("Pemilik Mobil  : " + mobil1.getPemilik());
        System.out.println("Pajak Mobil    : Rp. " + mobil1.getPajak());
        
    }
}
