
package soal1;

public class Buku {
    
    private String Judul, Penulis;
    private Integer Tahun;

    public Buku(String j, String p, Integer t) {
        this.Judul = j;
        this.Penulis = p;
        this.Tahun = t;
    }
    
    public void Display() {
        System.out.println("\nDetail Buku : ");
        System.out.println("Judul adalah " + Judul);
        System.out.println("Penulis adalah " + Penulis);
        System.out.println("Tahun Terbit adalah " + Tahun);
    }
}
