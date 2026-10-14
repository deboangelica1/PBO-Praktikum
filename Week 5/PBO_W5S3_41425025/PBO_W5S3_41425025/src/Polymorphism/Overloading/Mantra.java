/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.Overloading;

/**
 *
 * @author debo
 */
/*
*/
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
import java.util.*;
public class Mantra { 
    //overload: method ucapkan() dengan 1 parameter
    public void ucapkan(String namaMantra){
        System.out.println("mengucapkan mantra: " + namaMantra);
    }
    //overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan){
        System.out.println("mengucapkan mantra: " + namaMantra + " dengan kekuatan" + kekuatan);
        if (kekuatan > 10) {
            System.out.println("efek: lawan terlemar!");
        } else {
            System.out.println("efek: senjata terlepas. ");
        }
    }
    //overload: method ucapkan dgn tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target){
        System.out.println("mengucapkan mantra: " + namaMantra + " dengan kekuatan "+ kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("efek: " + target + " terlempar!");
        } else {
            System.out.println("efek: senjata " + target+ " terlepas.");
        }
    }
    
     //overload:Tambahkan overload method ucapkan() yang menerima parameter String
     //namaMantra dan String target (tanpa parameter kekuatan).
    public void ucapkan(String namaMantra, String target){
        System.out.println("mengucapkan mantra: " + namaMantra  + " pada " + target);
            System.out.println("efek: " + target + " terlempar!");
            System.out.println("efek: senjata " + target+ " terlepas.");
        }
    
    //coba buat method ucapkan dgn urutan parameter yg berbeda
    public void ucapkan(int kekuatan, String namaMantra){
        System.out.println("mengucapkan mantra: " + namaMantra + " dengan kekuatan" + kekuatan);
        if (kekuatan > 10) {
            System.out.println("efek: lawan terlemar!");
        } else {
            System.out.println("efek: senjata terlepas. ");
        }
    }
    
    
    public static void main(String[] args){
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 13, "voldemort");
        mantra.ucapkan("Expelliarmus", "mati");
        mantra.ucapkan(5, "Expelliarmus" );
        
    }
}
/*
Pertanyaan:
1. Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method
dengan dua parameter.
Jawab: kalau saya hapus method yg parameternya ada dua, itu error karna methodnya saya hapus
tapi di program mainnya saya panggil mantra.ucapkan yg paramternya ada dua, sementara itu dihapus
jadi programnya error

2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba
buat method ucapkan(int kekuatan, String namaMantra).
Jawab: 
bisa, sudah saya coba dengan urutan yg berbeda, dan definsiikan di proogram utamanya, programnya bisa jalan
*/
