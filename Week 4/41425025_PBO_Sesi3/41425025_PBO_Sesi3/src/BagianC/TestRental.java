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
Nama    :Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class TestRental {
    public static void main(String[] args){
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);
        
        v.plateNumber = "";  //baris A
        v.rentalRatePerDay = -500000; //baris B
        v.discountRate = 0.20; //baris C
        v.setRentalDays(-7); //baris D
        
        System.out.println("total biaya: Rp" + v.getTotalCost());
    }
}

/*
Soal:
1. Saat TestRental.java dikompilasi, baris manakah di antara Baris A, B, C, dan D
yang akan memicu compile-time error karena perbedaan package? Jelaskan aturan
cakupan akses (public, protected, default, dan private) yang menyebabkannya.
jawab: yang akan menyebbaan compile time error adalah baris B dan C
karna rentalPerDays pakai protected. Pada baris C juga error karna dicscountRate tidak ada
modifiern jadi akses defaultnya privat.

2a. Kelemahan Integritas Data (Data Hiding & Validation)
i) Perhatikan Baris A dan Baris D. Walaupun Baris D memangg metode setter, apa
cacat logika yang masih terjadi pada method setRentalDays?
jawab: walau baris D pakai setter, masih ada kelemahan pada method setRentalDays.
Karne method itu lsg simpan nilai ranpa ada validasi dulu.

2b. Nilai total biaya yang dihasilkan bisa bernilai negatif. Mengapa hal ini bisa terjadi dan
bagaimana cara merefaktor kelas VehicleRental agar data keuangannya aman dari
korupsi data (data corruption)?
jawab: nilai ttoal biaya bisa tidak masuk akal karna data yg digunakan dalam
perhitungan sbelum semua dilindungi dari nilai yg tidak valid.rentalDays isinya nilai negatif karna setRentalDays gaada 
validasi, rentalRatePerDay juga jadi negatif jika akses ke atribut lsg diperbolehkan. 
karna nilai nya dihitung di getTotalCost, hasil akhirnya jadi negatif.
untuk mengatasi masalahnya atribut penting seperti swewa sewaandan jumlah yang
hari sebaliknya dbuat private, lalu perubahan nilai dilakukan dari method
yang ada validasi, jadi nilai yg tdk valid ditolak sebelum digunakan.
*/
