package PRAK203_2110817210020_MuhammadSyauqiAlfath;

//public class Employee {
/* Nama class "Employee" disini salah, karena penamaan fle nya berbeda, seharusnya "Pegawai" */
public class Pegawai {
        
    public String nama;
    
    //public char asal;
    /* Pada inisialisasi tipe data di variabel "asal" tidak cocok dengan input data 
       yang dimasukkan sehingga terjadi error. Seharusnya menggunakan tipe data String
    */
    public String asal;
    public String jabatan;
    public int umur;
  
    public String getNama() {
        return nama;
    }
    /* Pada inisialisasi variabel "asal" harus disesuaikan tipedata nya dengan 
       data yang ingin diinputkan 
    */
    public String getAsal() {
        return asal;
    }
 
    //public void setJabatan() {
    //     this.jabatan = j;
    //}
    /* Pada baris ini method dipanggil sebagai argumen akan tetapi definisi dari method
       tersebut tidak memiliki parameter dan variabel j tidak pernah dideklarasikan
    */
    public void setJabatan(String j) {
        this.jabatan = j;
    }      

}
