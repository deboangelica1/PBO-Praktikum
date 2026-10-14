/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

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

public class OperasiString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();
        
        System.out.println("Panjang string:"+nama.length());
        System.out.println("Huruf pertama:"+nama.charAt(0));
        System.out.println("Mengandung spasi?"+nama.contains(" "));
    }
}
/*
Pertanyaan pemantik: Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
Jawab: Semua spasi tetap ikut dihitung dan tetap dianggap sebagai 
karakter dan dihitung oleh length(), dan contains(" ") tetap true karnea
program memeriksa apakh ada spasi bukan hitung jumlah spasi.
*/