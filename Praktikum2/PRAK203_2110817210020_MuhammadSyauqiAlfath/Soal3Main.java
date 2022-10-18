
package PRAK203_2110817210020_MuhammadSyauqiAlfath;

public class Soal3Main {
    
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        
        //p1.nama = "Roi"
        /* Pada baris ini tidak terdapat semicolon atau ";" sehingga terjadi error */
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        
        /* field umur belum diinisialisasi sehingga value nya 0, maka harus ditambahkan value umur */
        p1.umur = 17;
        
        //System.out.println("Nama Pegawai: " + p1.getNama());
        /* Hapus kata "Pegawai" agar sesuai dengan output yang diinginkan */
        System.out.println("Nama : " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        //System.out.println("Umur: " + p1.umur);
        /* Tambahkan kata "tahun" diakhirnya agar sesuai dengan output yang diminta */
        System.out.println("Umur: " + p1.umur + " tahun");
        }
    }

