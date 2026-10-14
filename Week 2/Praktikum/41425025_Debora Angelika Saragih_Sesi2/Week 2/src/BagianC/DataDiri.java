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
public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();
        
        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();
        
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
        
    }
}
/*
Kode ini yang sudah dimodif dimana data nya jadi diterima dari inputan user,
maknya menggunakan Scanner, dan ditambahkan import java,util,scanner karena
scanner itu class yang digunakan Java untuk menerima input dari keyboard
*/
