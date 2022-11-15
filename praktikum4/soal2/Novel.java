package soal2;

public class Novel extends Buku {
    
    private String genre, sinopsis;
    
    public Novel(String j, String p, String t, String g, String s) {
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.genre = g;
        this.sinopsis = s;   
    }
    
    public String getNovelDetail() {
        return "\nData yang baru diinputkan adalah\n" + 
                "Sebuah novel bergenre " + genre + " dengan judul \""
                + judul + "\". Novel tersebut ditulis oleh " + penulis + 
                " dan diterbitkan pada tahun " + tahun + 
                ".\nSinopsis : " + sinopsis + "...";
        
    }
    
}
