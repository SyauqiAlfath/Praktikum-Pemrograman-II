
package praktikum3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main { 
  public static void main(String[] args) { 
      
    Scanner inputDadu = new Scanner(System.in);
    int input = inputDadu.nextInt();
    int total = 0;
    
    LinkedList<Dadu> dadu = new LinkedList<Dadu>();
    for (int i=0; i <= input; i++ ) {
        dadu.add(new Dadu());
        
        dadu.getLast().acakNilai();
    }
    
    for (int j = 1; j < dadu.size(); j++) {
        System.out.println("Dadu ke-" + j + " Bernilai : " + dadu.get(j).getNilai());
    
        total = total + dadu.get(j).getNilai();
    }
    
      System.out.println("Total nilai dadu   : " + total);
  } 
}
