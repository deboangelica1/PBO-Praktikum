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
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

import java.util.Scanner; //class scanner dari java
public class KartuKredit {
    public static void main(String[] args) {
        //untuk menerima inputan dari user
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor kartu: ");
        String noKartu = input.nextLine(); //inpiutan yang diterima tipe data 

        //menghapus tanda hubung (-)
        String noTanpahubung = noKartu.replace("-", "");

        //validasi jumlah digit
        if (noTanpahubung.length() != 16) {
            System.out.println("Nomor kartu tidak valid.");
            System.out.println("Harus terdiri dari 16 digit.");

        //validasi digit pertama
        } else if (noTanpahubung.charAt(0) != '4'
                && noTanpahubung.charAt(0) != '5'
                && noTanpahubung.charAt(0) != '6') {
            System.out.println("Nomor kartu tidak valid.");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");

        //validasi apakah semua karakter adalah angka
        } else if (!noTanpahubung.matches("\\d+")) {
            System.out.println("Nomor kartu tidak valid.");
            System.out.println("Nomor kartu hanya boleh berisi angka dan tanda hubung.");

        //validasi posisi tanda hubung
        } else if (noKartu .contains("-")
                && !noKartu .matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}")) {
            System.out.println("Nomor kartu tidak valid.");
            System.out.println("Tanda hubung harus digunakan setiap 4 digit.");

        } else {
            System.out.println("Nomor kartu valid.");
        }
        input.close(); //mengehntikan scanner
    }
}
