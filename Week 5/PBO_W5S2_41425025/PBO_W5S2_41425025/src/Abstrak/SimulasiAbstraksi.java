/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
abstract class KendaraanEkspedisi { //sebuah class abstrak namanaya KendaraanEkspedisi disebutjuga class induk
    protected String noPolisi; //atribut dri class2 tsb
    protected int kapasitasKg;
    
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg){ //sebuah construct
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
    public void infoKendaraan() { //method class yg namanya infoKendaraan
        System.out.println("plat nomor: " + noPolisi + " |daya angkut: " + kapasitasKg + " Kg");
    }
    
    public abstract void angkutBarang(String namaBarang); //method kedua dari class itu namanya angkutBarang
}

class TrukBox extends KendaraanEkspedisi { //sebuah classs anak
    public TrukBox(String noPolisi, int kapasitasKg){
        super(noPolisi, kapasitasKg);
    }
    
    @Override
    public void angkutBarang(String namaBarang){ //mengikutmethod dari class induk
        System.out.println("truk ["+ noPolisi + "] memuat '" + namaBarang + "' ke dalam kontainer tertutup pendingin");
    }
}

class MobilVan extends KendaraanEkspedisi { //sebuah class anak 
    public MobilVan(String noPolisi, int kapasitasKg){
        super(noPolisi, kapasitasKg);
    }
    @Override
    public void angkutBarang(String namaBarang){
        System.out.println("mobil van[" + noPolisi + "] memuat '" + namaBarang + "' dibagasi belakang untuk distribusi kota");
    }
}

class MotorKurir extends KendaraanEkspedisi { //ini percobaan, error karna motor kurir belum ada method yg ada di class induk
    
}
public class SimulasiAbstraksi { //program menjalankannya
    public static void main(String[] args){
        System.out.println("INI ABSTRACT CLASS");
        
        KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100); //percobaan, error krna di abstract tdk bsa inisialisasi dgn operator new
        
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan(); //class anak panggil method
        fuso.angkutBarang("20 unit kulkas");
        
        System.out.println("---------------");
        
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 kotak sepatu");
    }
}
/*
Eksperimen 1: Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep"
yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?
Jawab:
run:
Exception in thread "main" java.lang.RuntimeException: Uncompilable code - Abstrak.KendaraanEkspedisi is abstract; cannot be instantiated
	at Abstrak.SimulasiAbstraksi.main(SimulasiAbstraksi.java:1)
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 1 second)
ABstract class tidak boleh dibuat menjadi objek secara lsg, seperti di modul dalam abstract 
tidak bisa melakukan insialisasi secara lsg menggunakan operator new.

Eksperimen 2: Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir.
Tuliskan dua opsi solusi/perbaikan yang ditawarkan oleh IDE Java (seperti
NetBeans/IntelliJ/Eclipse) untuk mengatasi error tersebut!
Jawab: 
Kalau punyaku ada 3 opsi perbaikan, yang pertama "implement all abstract methods",
"make class MotorKurir abstract", "remove unused "Motor Kurir" ".
Intinya KendaraanEkspedisi sbgi abstract class boleh punya method abstrak yg belum
memilki isi, tpi class turunannya wajib isi method nya.
*/
