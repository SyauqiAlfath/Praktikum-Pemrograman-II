package soal2;

public class Komik extends Buku {
    
    private Integer volume;
    private String sinopsis;

    public Komik(String j, String p, String t, Integer v, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }
    
    public String getKomikDetail() {
        return "\nData yang diinputkan adalah\n" + 
                "Sebuah komik dengan judul " + judul + 
                ". Komik tersebut dibuat oleh " + penulis +
                " dan diterbitkan pada tahun " + tahun + 
                ".\nSampai saat ini komik tersebut memiliki "
                + "jumlah volume sebanyak " + volume + " buah.\n"
                + "Sinopsis : " + sinopsis + "...";
    }
    
}
