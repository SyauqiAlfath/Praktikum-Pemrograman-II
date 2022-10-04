package prak101;

import java.util.Scanner;
        
public class PRAK101_2110817210020_MuhammadSyauqiAlFath {
    public static void main(String[] args) {
        // deklarasi
        String Nama_Lengkap, Tempat_Lahir, Bulan;
        int Tgl_Lahir, Bulan_Lahir, Tahun_Lahir, Tinggi_Badan;
        float Berat_Badan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap  : ");
        Nama_Lengkap = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir  : ");
        Tempat_Lahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir : ");
        Tgl_Lahir = keyboard.nextInt();
        
        // pake switch case buat nentuin bulan
        System.out.print("Masukkan Bulan Lahir   : ");
        Bulan_Lahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir   : ");
        Tahun_Lahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan  : ");
        Tinggi_Badan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan   : ");
        Berat_Badan = keyboard.nextFloat();
        
        //swith case disini
        switch (Bulan_Lahir) {
            case 1:
                Bulan = "Januari";
                break;
            case 2:
                Bulan = "Februari";
                break;
            case 3:
                Bulan = "Maret";
                break;
            case 4:
                Bulan = "April";
                break;
            case 5:
                Bulan = "Mei";
                break;
            case 6:
                Bulan = "Juni";
                break;
            case 7:
                Bulan = "Juli";
                break;
            case 8:
                Bulan = "Agustus";
                break;
            case 9:
                Bulan = "September";
                break;
            case 10:
                Bulan = "Oktober";
                break;
            case 11:
                Bulan = "November";
                break;
            case 12:
                Bulan = "Desember";
                break;
            default:
                Bulan = "(Salah Bulan)";
        }
        
        //========================
        System.out.println("\nData Telah ditambahkan,");
        System.out.println("Nama Lengkap " + Nama_Lengkap + ", Lahir di " + Tempat_Lahir + " Pada Tanggal " + Tgl_Lahir + " " + Bulan + " " + Tahun_Lahir );
        System.out.println("Tinggi Badan " + Tinggi_Badan + " cm dan Berat Badan " + Berat_Badan + " Kilogram");
        
    }
    
}
