/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractcombiPolymorphism;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

import java.util.*;  //yg memuat seluruh kelas dan interface

import java.util.ArrayList; //kelas konkret arraylist implementasi dari list
import java.util.List; //supaya bisa variabel dideklarasi dalam sebuah list

abstract class Mantra{//sebuah classs mantra sekligus induk
    private String nama; //atribut class dgn acces modifier private
    
    public Mantra(String nama){ 
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    //abstract method utk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra{ //class anak atau objek dari mantra
    public Expelliarmus(){
        super("Expelliarmus");
    }
    
    @Override
    public void efek(){
        System.out.println("melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra{
    public ExpectoPatronum(){
        super("Expecto Patronum");
    }
    
    @Override
    public void efek(){
        System.out.println("memanggil patronus!");
    }
}

class Lumos extends Mantra{
    public Lumos(){
        super("Lumos");
    }
    
    @Override
    public void efek(){
        System.out.println("menerangi ujung tongkat!");
    }
}

class Penyihir{
    private String nama;
    private List<Mantra> mantraList;
    
    public Penyihir(String nama){
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }
    
    public void belajarMantra(Mantra mantra){
        mantraList.add(mantra);
        System.out.println(nama+ " belajar mantra: "+ mantra.getNama());
    }
    
    public void ucapkanMantra(String namaMantra){
        for (Mantra mantra: mantraList){
            if (mantra.getNama().equals(namaMantra)){
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama+ " belum belajar mantra "+ namaMantra);
    }
    
    //modif kode sup[aya penyihir bisa mengcuapkan semua mantra yg udh dipelajari
    public void ucapSemuaMantra(){
        for (Mantra mantra : mantraList){
            System.out.println(nama + " mengucapkan semua: " + mantra.getNama());
            mantra.efek();
        }
    }
}
public class DuniaSihir {
    public static void main(String[] args){
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();
        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
        harry.belajarMantra(lumos);
        
        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos");
        
        harry.ucapSemuaMantra();

        
    }
}
/*
Pertanyaan:
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
jawab: 
dari contoh ini abstract class itu jadi sebauh cetak biru untuk jenis jenis mantra, pada bagian
public abstract void efek itu mewajibkan kelass turunannya menyediakan implementasi method efek
karna mantra abstract, jadi gabisa dibuat objeknya secara lsg dengan operator new.
polymorphism diisni menjadi satu refrensi utk jenis jenis objek dan pemanggilan method yg sama.
lalu objek seperti mantra expelliarmus dll nya itu disimpan di list mantra dan mereka pakai method overriding
yg merupakan penerapan polymorphism. Intinya abstractt utk penentu aturan yg hrus dilakukan pprogramnya
dan polymorphism yg buat objek berbeda beda bisa dipanggil dgn tipe umum meskipun perilakunya beda.

2. Apa yang akan terjadi jika kita menambahkan mantra baru tanpa mengubah
kelas Penyihir? Apakah mudah? Mengapa?
jawab: mudah, tinggal buat aja mantra baru, dan udh aku coba, kalau kita nambahkan mantra baru, class penyihir gaush 
diubah lagi karna class penyihir bisa menerima semua objek turunan mantra dari sintaks list<Mantra> 
dan method efeknya juga bisa langsung dari mantra.efek.
*/
