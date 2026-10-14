/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author debo
 */
/*
NIM     : 41425025
Nama    : Debora Angelika Saragih
Motto   : ORAET LABORA
*/
import java.util.Scanner;
public class HitungRataRata {
    public static void main (String[] args) {
        
        //untk menerima input dari user
        Scanner input = new Scanner(System.in);
        
        //meminta user masukkan 3 nilai
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();
        
        //hitung rata2 nilai
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        
        //tampilkan hasilnya 
        System.out.printf("Rata-rata: %.2f%n", rataRata);
    }
}
