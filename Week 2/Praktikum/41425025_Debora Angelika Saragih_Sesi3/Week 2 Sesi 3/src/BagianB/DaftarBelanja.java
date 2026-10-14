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

import java.util.Scanner; //digunakan supaya bisa pakai Scanner
public class DaftarBelanja {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //array untuk menyimpan daftar belanja
        String[] daftarBelanja = new String[100];
        //menyimpan jumlah item yang sudah dimasukkan
        int banyakItem = 0; //diawal dibuat 0 karena user belum masukkan barng
        //ini juga nnt menyimpan berapa banyak data yang digunakan di dalam array

        int pilihan;

        do {
            System.out.println("\n Daftar Belanja ");
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) { //siwtch ini nanti user bisa pilih,
                //dan nanti menentukan apa yg hrus dilakukan berdaasar pilihan user
                case 1: //artinya user pilih pilihan 1
                    //menambahkan item
                    System.out.print("Masukkan item: ");
                    String item = input.nextLine();
                    daftarBelanja[banyakItem] = item;
                    banyakItem++; //nanti tiap ditmbah item bertambah satu dst
                    System.out.println(item+ "berhasil ditambahkan");
                    break;

                case 2: //artinya user pilih pilihan 2
                    //menghapus item
                    if (banyakItem == 0) {
                        System.out.println("Daftar belanja masih kosong!");
                        break;
                    }
                    System.out.print("Hapus item pada posisi: "); //minta posisi item yg mau dihapus
                    int posisiHapus = input.nextInt();
                    
                    //ini untuk membuat kondisi dan cek inputan, misal item ad 3, tpi dia input item ke 4 dihapus jd dicek disni
                    if (posisiHapus < 1 || posisiHapus > banyakItem) { //caranya kurang dr 1 atau lebih besar dr jumlah item tadi
                        System.out.println("Posisi item tidak valid!");
                        break;
                    }

                    String itemDihapus = daftarBelanja[posisiHapus - 1];

                    //menggeser item setelah item yang dihapus
                    for (int i = posisiHapus - 1;
                         i < banyakItem - 1;
                         i++) {
                        daftarBelanja[i] = daftarBelanja[i + 1];
                    }

                    banyakItem--;
                    System.out.println(
                        itemDihapus + " berhasil dihapus!");
                    break;

                case 3:
                    //menampilkan semua item
                    if (banyakItem == 0) { //kalau belum ada daftar belanja
                        System.out.println(
                            "Daftar belanja masih kosong!");
                    } else {
                        System.out.println("Daftar belanja:");
                        for (int i = 0; i < banyakItem; i++) {
                            System.out.println(
                                (i + 1) + ". " + daftarBelanja[i]);
                        }
                    }
                    break;

                case 4:
                    //mencari item
                    if (banyakItem == 0) { //kalau belum ada daftar belanja
                        System.out.println(
                            "Daftar belanja masih kosong!"
                        );
                        break;
                    }
                    System.out.print("Cari item: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < banyakItem; i++) {
                        if (daftarBelanja[i].equalsIgnoreCase(cari)) {
                            System.out.println(
                                cari + " ditemukan pada posisi " + (i + 1));
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println(cari + " tidak ditemukan.");
                    }
                    break;

                case 5: //program keluar
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
        input.close();
    }
}
