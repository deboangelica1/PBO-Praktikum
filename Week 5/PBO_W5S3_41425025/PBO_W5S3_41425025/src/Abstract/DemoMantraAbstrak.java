/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

import java.util.*;

abstract class MantraAbstrak{
    private String nama;
    
    public MantraAbstrak(String nama){
        this.nama = nama;
    }
    //hars diimplementasikan oleh subclass
    public abstract void efek();
    
    //method konkret
    public void ucapkan(){
        System.out.println("mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak{
    public Expelliarmus(){
        super("expelliarmus");
    }
    @Override
    public void efek(){
        System.out.println("efek: melucuti senjata lawan");
    }
}

class ExpectoPatronum extends MantraAbstrak{
    public ExpectoPatronum(){
        super("expecto patronum");
    }
    @Override
    public void efek(){
        System.out.println("efek: memanggil patronus untuk melawan dementor");
    }
}

class Lumos extends MantraAbstrak{
    public Lumos(){
        super("WL charm");
    }
    @Override
    public void efek(){
        System.out.println("efek: mengeluarkan cahaya dari ujung tongkat sihir,");
    }
}
public class DemoMantraAbstrak {
    public static void main(String[] args){
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();
        MantraAbstrak mantracoba = new MantraAbstrak("Mantra Rahasia"); //coba buat objek langsung
        
        mantra1.ucapkan();
        mantra1.efek();
        
        mantra2.ucapkan();
        mantra2.efek();
        
        mantra3.ucapkan();
        mantra3.efek();
    }
}
/*
Pertanyaan:
1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
Coba dan jelaskan errornya.
Jawab: 
aku coba dan java menolak, akan error Exception in thread "main" java.lang.RuntimeException: Uncompilable code - cannot find symbol
  symbol:   class antraAbstrak
  location: class DemoMantraAbstrak
	at DemoMantraAbstrak.main(DemoMantraAbstrak.java:1)
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 1 second).
alasannya karena secara konsep abstract itu tidak bisa membuat atau menginsialisasi objek lsg dgn operator new
karna abstrak itu cetakan atau blueprint kodneya jdi hrus extend dgn class induknuya, gabisa lsgbuat baru

2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
jawab: 
ini perlu kalau kita mau buat sebuah blueprint untuk kelas kelas yg berhubungan, dan kalau kelas yg mau dibuat
terlalu umum kalau dibuat objek sendiri, jd keungtungannya menghindari perluangan kode,
mengamankan kodenya supaya tidakbisa asal diakses.
*/

