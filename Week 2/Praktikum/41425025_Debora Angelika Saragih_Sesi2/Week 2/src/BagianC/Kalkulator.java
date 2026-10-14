/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

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

public class Kalkulator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah: " + (a+b));
        System.out.println("Kurang: " + (a-b));
        System.out.println("Kali: " + (a*b));
        System.out.println("Bagi: " + ((double) a/b));
        
        //untuk cari modulus
        System.out.println("Modulus: " + (a % b));
        
       //untuk cari perpangkatan
       System.out.println("Pangkat: " + Math.pow(a, b));
    }
}
/*
Kode ini yang sudah saya modifikasi dengan menambahkan 
kode untuk menghitung modulus dan perpangkatan
*/