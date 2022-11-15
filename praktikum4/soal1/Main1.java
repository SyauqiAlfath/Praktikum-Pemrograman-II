
package soal1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        
        String penulis, judul;
        Integer tahun;
        
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Judul : ");
        judul = inputan.nextLine();
        
        System.out.print("Penulis : ");
        penulis = inputan.nextLine();
        
        System.out.print("Tahun Terbit : ");
        tahun = inputan.nextInt();
        
        Buku isiBuku = new Buku(judul, penulis, tahun);
        
        isiBuku.Display();
    }
}
