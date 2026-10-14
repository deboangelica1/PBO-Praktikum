/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

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
public class Palindrome {
    public static void main(String[] args) {
        
        //membuat Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        //minta user masukkan sebuah kata
        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();
        
        //kata diubah jdi hruuf kecil biar dicek dibedakan hruf besar dan huruf kecil
        String kataKecil = kata.toLowerCase();
        
        //buat variabel nantinya nyimpan kata yang dibalik
        String kataTerbalik = "";
        
        //membalik kata dari karakter terakhir ke karakter pertama
        for (int i = kataKecil.length() - 1; i >= 0; i--) {
            kataTerbalik += kataKecil.charAt(i);
        }
        
        //dicek apakah kata sama dengan kata yang sudah dibalik
        if (kataKecil.equals(kataTerbalik)) {
            System.out.println("Palindrome: Ya");
        } else {
            System.out.println("Palindrome: Tidak");
        }
        
        //buat variabel utk menghitung jumlah huruf vokal
        int jumlahVokal = 0;
        
        //mengecek karakter dalam kata
        for (int i = 0; i < kataKecil.length(); i++) {
            char huruf = kataKecil.charAt(i);
            
            // mengecek karakter yg huruf vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u'
                    || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }
        
        //ditampilkan jumlah kata yg huruf vokal
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }
    /*
    Kode ini tuujuannya ketika user input kata, maka akan dicek apakah kata
    yang sama dengan kata yang sudah dibalik, jadi disini juga diubah kata nya jad
    huruf kecil, manatau user input ada hruf besar, supaya pas dicek
    tidak dibedakan huruf besar dan huruf kecil, lalu kata yang diinput 
    dicek juga jumlah hruf vokalnya.
    */
}
