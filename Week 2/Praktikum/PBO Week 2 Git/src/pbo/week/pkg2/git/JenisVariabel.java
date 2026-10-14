/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week.pkg2.git;

/**
 *
 * @author debo
 */
public class JenisVariabel {
    //instance variable
    int speed;
    
    //class variable
    static int jumlahMahasiswa;
    
    //parameter
    String nama;
    void setNama(String nama){
        this.nama  = nama;
    }
    
    //local variabel
    void hitung(){
        int count = 0;
        count++;
        
        System.out.println("Count =" + count);
    }
    
    //PENAMAAN VARIABEL
    int umur = 20;
    double gaji = 3500000.50;
    boolean lulus = true;
    String nama = "Budi";
}

