/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.Overloading;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

class MesinTarif { //sebuah class bernama MesinTarif
        private String kotaAsal //atribut dgn acces modifier private
public MesinTarif(String kotaAsal) { 
this.kotaAsal = kotaAsal; 
}

public double hitungOngkir(double beratKg) { //sebuah method dgn parameter beratKg tipe data double
return beratKg * 10000;
}

public double hitungOngkir(double beratKg, double nilaiBarang){ //method yg sama tp parameternya ada 2 
double biayaAsuransi = nilaiBarang * 0.01;
return (beratKg * 10000) + biayaAsuransi;
}

public double hitungOngkir(double beratKg, boolean isExpress){ //method sama tp parameternya 2 dan beda tipe data
double total = beratKg * 10000;
if (isExpress) {
total += 20000;
}
return total;
}
}
public class SimulasiOverloading { //program menjalankan
    public static void main(String[] args){
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("INI METHOD OVERLOADING");
        System.out.println("ongkir biasa (2.0 Kg) : Rp" + tarif.hitungOngkir(2.0));
        System.out.println("ongkir + Asuransi (Barang 5jt) : Rp" + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("ongkir express(2.0 Kg) : Rp" + tarif.hitungOngkir(2.0, true));
    }
}
/*
Pertanyaan Analisis:
1. Mengapa compiler Java dapat menentukan method hitungOngkir mana yang dijalankan
sebelum program dieksekusi (compile-time)? Bagian method apa yang diperiksa compiler?
Jawab: 
java melihat parameter methodnya, jumlah p-arameternya, dan tipe data parameternya
dan urutan parammeternya atau bisa disebut method signature, jadi dari sebuah method,
bagian method yang diperiksa kompiler itu parameter, jumlah parameter dan tipe data parameternya.

2. Jika pada class MesinTarif ditambahkan method berikut:
public int hitungOngkir(double beratKg) {
return (int)(beratKg * 10000);
}
Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)?
Jawab:
karna compiler memeriksa parameter dibagian methodnya, didalam parameter beratKg itu udah
dibuat tipe datanya double, jadi itu yang didefinisikan, makanya error karena sebelumnya udah ada 
method yang tipe data paramteernya juga double.
*/
