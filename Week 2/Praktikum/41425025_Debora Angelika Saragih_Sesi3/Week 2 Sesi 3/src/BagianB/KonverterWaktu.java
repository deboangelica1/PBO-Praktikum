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
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
import java.util.Scanner; //class scanner dari java
public class KonverterWaktu {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //nerima inputan dari user

        //judul atau utk menampilkan teks
        System.out.println("Konverter Waktu");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");

        System.out.print("\nPilihan: "); //buat  pilihan tpi di baris baru 
        int pilihan = scanner.nextInt(); //tipe data yang diinput integer

        if (pilihan == 1) { //kondisi jika pilih 1 jlankan la program yg dibwah ini 

            //detik ke HH:MM:SS
            System.out.print("Masukkan jumlah detik: "); //nerima inputan detik
            int totalDetik = scanner.nextInt();

            int jam = totalDetik / 3600; //rumus hitung jam
            int sisaDetik = totalDetik % 3600; //ambil sisa pembagian untuk detik

            int menit = sisaDetik / 60; //rumus utk hitung menit
            int detik = sisaDetik % 60;
            //ditampilkan hasilnya
            System.out.printf("Hasil: %02d:%02d:%02d%n", jam, menit, detik);
        } else if (pilihan == 2) { //kondisi jika piliha user 2 program dibawah ini dijalankan

            //HH:MM:SS ke detik
            System.out.print("Masukkan waktu (HH:MM:SS): "); //nerima inputan user
            String waktu = scanner.next(); //pakai string karena dibgian ini inputan bukan cmn angka

            String[] bagian = waktu.split(":"); //untuk misahkan string berdasar tanda :

            int jam = Integer.parseInt(bagian[0]); //integer.parseInt ini utk mengubah string ke integer
            int menit = Integer.parseInt(bagian[1]);
            int detik = Integer.parseInt(bagian[2]);

            int totalDetik = (jam * 3600) + (menit * 60) + detik; //mengubah inputan keseluruhan jdi total detik
            //menampilkan hasilnya
            System.out.println("Hasil: " + totalDetik + " detik");
        } else {
            //ini output kalau inputan bukan 1 aatau 2 atau tidak ada
            System.out.println("Pilihan tidak valid!");
        }
        scanner.close(); //menutup scanner artinya udh selesai digunakan
    }

}
