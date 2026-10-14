/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author debo
 */
/*
Nama    :Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class StudentGrade { //buat class namanya StudentGrade
    private String nim; //atribut atribut dengan acces modifier privat
    private String nama;
    private double nilaiKuis;
    private double nilaiUTS;
    private String grade;
    
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        this.grade = "E";
    }
    //cuman ada method getter tanpa setter karna nim dan nama sifatnya read only gabisa sembaranga diakses
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public double getNilaiKuis() {
        return nilaiKuis;
    }
    public void setNilaiKuis (double nilaiKuis) { //method set nilai kuis
        if(nilaiKuis >= 0.0 && nilaiKuis <= 100.0) { //kodisi sebuah nilai kuis
            this.nilaiKuis = nilaiKuis;
            updateGrade();
        } else {
            System.out.println("error: nilai kuis antara 0 - 100");
        }
    }
    public double getNilaiUTS() { //method getter juga
        return nilaiUTS;
    }
    public void setNilaiUTS(double nilaiUTS) {
        if(nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGrade();
        }else {
            System.out.println("error: nilai UTS hars sampai 100");
        }
    }
    public double hitungNilaiAkhir() {
        return(nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }
    private void updateGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 60) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
    }
    public String getgrade() {
        return grade;
    }
    public void cetakData() {
        System.out.println("KARTU HASIL STUDI");
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Kuis  : " + nilaiKuis);
        System.out.println("Nilai UTS   : " + nilaiUTS);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade       : " + grade);
    }
}
