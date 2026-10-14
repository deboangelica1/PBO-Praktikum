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

public class Lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        
        if (r < 0){
            System.out.println("Error: jari jari tidak boleh negatif. ");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas:" +luas);
            System.out.println("Keliling:" +keliling);
        }
    }
}

/*
Pertanyaan Pemantik:
1. Mengapa kita perlu validasi r<0?
Jawab: Karena jari jair lingkaran tidak bole bernilai negaitf, 
kalau diisi jari-jari kurang dari 0, program ga menghitung dan menampilkan pesan error.
2. Dalam aplikasi nyata, dimana validasi input sangat penting
Jawab: Diaplikasi nyata contohnya, saat mau transfer uang inputan nominal 
tidak boleh 0. Contoh lain saat login, username harus unik, dan password harus dicek.
Jadi validasi input penting saat memastikan data yg dimasukkan pengguna sesuai dengan
aturan dan mencegah kesalahan program.
*/
