package prak105;

import java.util.Scanner;

public class PRAK105_2110817210020_MuhammadSyauqiAlFath {

    public static void main(String[] args) {
        float tinggi, jari;
        double volume;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukan jari-jari : ");
        jari = keyboard.nextFloat();
        
        System.out.print("Masukan tinggi    : ");
        tinggi = keyboard.nextFloat();
        
        // hasil volume
        volume = 3.14 * jari * jari * tinggi;
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm dan tinggi " + tinggi + " cm adalah " + volume + " m3");
        
    }
    
}
