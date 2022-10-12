package praktikum1;

import java.util.Scanner;

public class PRAK104_2110817210020_MuhammadSyauqiAlfath {

    public static void main(String[] args) {
        int Andi, A1, A2, A3;
        int Budi, B1, B2, B3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi : ");
        A1 = keyboard.nextInt();
        A2 = keyboard.nextInt();
        A3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi : ");
        B1 = keyboard.nextInt();
        B2 = keyboard.nextInt();
        B3 = keyboard.nextInt();               
        
        Andi = 0; Budi = 0;
        
        if (A1 > B1) {
            Andi = Andi + 1;
        } else if(A1 == B1) {
            
        } else {
            Budi = Budi + 1;
        }
        
        if (A2 > B2) {
            Andi = Andi + 1;
        } else if(A2 == B2) {
            
        } else {
            Budi = Budi + 1;
        }
        
        if (A3 > B3) {
            Andi = Andi + 1;
        } else if(A3 == B3) {
            
        } else {
            Budi = Budi + 1;
        }
        
        if (Andi > Budi){
            System.out.println("Andi");
        } else if (Andi == Budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
        }
    }
    
}
