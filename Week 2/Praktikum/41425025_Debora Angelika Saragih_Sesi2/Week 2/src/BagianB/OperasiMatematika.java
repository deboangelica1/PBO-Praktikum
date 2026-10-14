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
public class OperasiMatematika {
    public static void main(String[] args) {
        
        //minta inputan dri user
        Scanner input = new Scanner(System.in);
        
        //minta user masukkan kedua angka
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
        
        //hitung sisa bagi dengan modulus %
        int sisaBagi = angka1 % angka2;
        
        //hitung perpangkatan dengan math.pow
        double pangkat = Math.pow(angka1, angka2);
        
        //hasilnya ditampilkan 
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + (int) pangkat);
    }
}
