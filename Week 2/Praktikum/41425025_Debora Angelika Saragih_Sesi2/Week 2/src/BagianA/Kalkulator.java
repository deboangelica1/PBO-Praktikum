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
    }
}
/*
Pertanyaan pemantik: 
1. Mengapa pembagian int perlu di-casting ke double?
Jawab: Karena pembagian int hasilnya ga selalu int, bisa aja ada desimal
atau angka dibelakang koma, makanya di casting ke double
2. Apa risiko jika pembagi=0?
Jawab: Jika pembagi = 0 maka akan terjadi error, atau tidak terdeteksi,
tapi setelah saya coba sendiri, outputnya "infinity"
*/
