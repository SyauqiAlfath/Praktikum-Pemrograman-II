
package PRAK201_2110817210020_MuhammadSyauqiAlfath;

public class Mangga {
    String NamaMangga;
    float beratMangga;
    int jumlahMangga, hargaMangga;
    
    // Konstruktor
    public Mangga(String Nama, float berat, int jumlah, int harga) {
        this.NamaMangga = Nama;
        this.beratMangga = berat;
        this.hargaMangga = harga;
        this.jumlahMangga = jumlah;
    }
    
    // Method
    public void warung() {
        System.out.println("Nama Mangga : " + NamaMangga);
        System.out.println("Berat       : " + beratMangga + " kg");
        System.out.println("Jumlah Beli : " + jumlahMangga);
        System.out.println("Total Berat : " + beratMangga*jumlahMangga + " kg");
        System.out.println("Total Harga : Rp. " + hargaMangga*jumlahMangga + "\n");
       
    }
}
