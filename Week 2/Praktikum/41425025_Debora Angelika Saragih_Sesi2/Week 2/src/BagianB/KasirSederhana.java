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
public class KasirSederhana {
     public static void main(String[] args) {
         
         //untuk menerima inputan user
        Scanner input = new Scanner(System.in);
        
        //inputan nama barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        
        //inputan harga barang
        System.out.print("Masukkan harga barang: ");
        double hargaBarang = input.nextDouble();
        
        //inputan jumlah belii
        System.out.print("Masukkan jumlah beli: ");
        int jumlahBeli = input.nextInt();
        
        //disini dihitung total belanja tp sbeelum diskon
        double totalBelanja = hargaBarang * jumlahBeli;
        
        //ini variabel menyimpan jumlah diskon
        double diskon = 0;
        
        //kondisi jika diskon 10% jdi total belanja min.100.000
        if (totalBelanja >= 100000) {
            diskon = totalBelanja * 0.10;
        }
        
        //hitung total yg hrus dibayar
        double totalBayar = totalBelanja - diskon;
        
        //ditampilkan hasilnya
        System.out.println("Total sebelum diskon: " + (int) totalBelanja);
        System.out.println("Diskon: " + (int) diskon);
        System.out.println("Total bayar: " + (int) totalBayar);
    }
}
