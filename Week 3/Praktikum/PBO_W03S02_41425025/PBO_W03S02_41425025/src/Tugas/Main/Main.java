/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Main;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
class Mahasiswa {
    String nama;
    String niml
}
class MahasiswaAktif extends Mahasiswa{
    int semester;
    
    void belajar() {
        System.out.print(nama+ " sedang belajar");
    }
}
public class Main {
    public static void main(String[] args) {
        MahasiswaAktif m1 = new MahasiswaAktif();
        
        m1.nama ="Budi";
        m1.nim = "12345";
        m1.semester = 3;
        
        System.out.println ("Nama: " + m1.nama);
        System.out.println ("NIM: " + m1.nim);
        System.out.println("Semester: " + m1.semester);
        
        m1.belajar();
    }
}
