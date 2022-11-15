package soal2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        
        Integer bukuPilihan;
        
        Scanner input = new Scanner(System.in);
        
        // Milih buku (input)
        System.out.println("Pilih buku yang ingin diinputkan : ");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan : ");
        bukuPilihan = input.nextInt();
        input.nextLine();
        
        // Cabang Komik atau Novel
        if (bukuPilihan == 1) {
            String judul, penulis, genre, sinopsis, tahun;
        
            System.out.print("Judul : ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Genre : ");
            genre = input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();
            
            // Instansiasi Objek Novel
            Novel bukuNovel = new Novel(judul, penulis, tahun, genre, sinopsis);
            System.out.println(bukuNovel.getNovelDetail());
            
        }
        
        else if (bukuPilihan == 2) {
            String judul, penulis, tahun, sinopsis;
            Integer volume;
            
            System.out.print("Judul : ");
            judul = input.nextLine();
            
            System.out.print("Penulis : ");
            penulis = input.nextLine();
            
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();
            
            System.out.print("Volume : ");
            volume = input.nextInt();
            input.nextLine();
            
            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();
            
            // Instansiasi Objek Komik
            Komik bukuKomik = new Komik(judul, penulis, tahun, volume, sinopsis);
            System.out.println(bukuKomik.getKomikDetail());
            
        }
        
    }
    
}
