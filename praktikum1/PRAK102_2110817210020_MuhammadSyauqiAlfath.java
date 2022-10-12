
package praktikum1;

import java.util.Scanner;

public class PRAK102_2110817210020_MuhammadSyauqiAlfath {
    public static void main(String[] args) {
        int angka_input, bilangan;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka_input = keyboard.nextInt();
        
        int i = 7;
        while (i > 0) {            
            if (angka_input % 2 == 0){
                bilangan = (angka_input / 2) - 1;
            } else {
                bilangan = angka_input;
            }
            
            if (i == 7){
               System.out.print(bilangan);
            } else {
               System.out.print(", " + bilangan);
            }
            
            angka_input = angka_input + 1;
            i = i - 1;
        }
    }
}    
