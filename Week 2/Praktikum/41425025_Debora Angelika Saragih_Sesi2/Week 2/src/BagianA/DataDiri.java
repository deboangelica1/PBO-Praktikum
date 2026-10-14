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
public class DataDiri {
    public static void main(String[] args) {
        String nama = "Andi";
        int umur = 19;
        double tinggi = 165.8;
        boolean isMahasiswa = true;
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);
        
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}

/*
Pertanyaan Pemantik: Apa perbedaan nilai asli double dengan hasil casting int?
Jawaban : Nilai asli double dia menyimpan angka desimal, 
tapi yang casting ke int, bagian desimalnya dihilangkan
*/