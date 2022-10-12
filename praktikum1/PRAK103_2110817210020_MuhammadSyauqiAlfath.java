package praktikum1;

import java.util.Scanner;

public class PRAK103_2110817210020_MuhammadSyauqiAlfath {
   
    public static void main(String[] args) {
        int angka_input;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka_input = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (angka_input % 7 != 0){
                if (i == 5){
                   System.out.print(angka_input);
                } else {
                    System.out.print(", " + angka_input);
                }
            }
            
            angka_input = angka_input - 1;
            i = i - 1;
        } while (i > 0);
    }
    
}
