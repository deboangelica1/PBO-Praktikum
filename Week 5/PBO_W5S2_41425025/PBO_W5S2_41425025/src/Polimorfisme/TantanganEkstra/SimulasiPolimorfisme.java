/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.TantanganEkstra;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

class KendaraanEkspedisi { //classs induk
    public void angkutBarang() { //method class induk
        System.out.println("Kendaraan emngangkut barang");
    }
}
class Truk extends KendaraanEkspedisi { //class anak
    @Override
    public void angkutBarang() { //method class anak turunan dri class induk
        System.out.println("truk angkat barang dari jalur darat");
    }
}
class Drone extends KendaraanEkspedisi { //sama ini class anak juga
    @Override
    public void angkutBarang(){
        System.out.println("drone angkat barang dari jalur udara");
    }
}

class Kapal extends KendaraanEkspedisi { //class anak
    @Override
    public void angkutBarang(){
        System.out.println("kapal angkat barang dari jalur air");
    }
}
public class SimulasiPolimorfisme {
    public static void main(String[] args){
        KendaraanEkspedisi[] armada = { //dibuat dengan indeks array class class anaknya
            new Truk(),
            new Drone(),
           new Kapal()
        };
        
        for (KendaraanEkspedisi kendaraan: armada) {
            kendaraan.angkutBarang();
        }
    }
}
