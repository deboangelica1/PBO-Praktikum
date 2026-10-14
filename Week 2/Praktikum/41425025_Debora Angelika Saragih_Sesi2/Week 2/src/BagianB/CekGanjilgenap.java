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
public class CekGanjilgenap {
    public static void main(String[] args) {
        
        //untuk menerima inputan dri user
        Scanner input = new Scanner(System.in);
        
        //meminta user masukkan bilangan
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        
        //utk cek bilangan habis dibagi 2, jika iay genap, jika tidak ganjil
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
