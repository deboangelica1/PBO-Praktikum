/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/

import java.util.Scanner;
public class GradeSystem {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double total = 0;
        
        //input nilai
        for(int i=0; i<5; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            grades[i] = scanner.nextDouble();
            total += grades[i];
        }
        
        //hitung rata-rata
        double average = total/5;
        System.out.println("Rata-rata nilai: " + average);
        
        //kaetgorukan nilai
        char grade;
        if(average >= 85) grade = 'A';
        else if(average >= 70) grade = 'B';
        else if(average >= 60) grade = 'C';
        else if(average >= 50) grade = 'D';
        else grade = 'E';
        
        System.out.println("Grade: " + grade);
        
        //tampilkan nilai tertinggi dan terdendah
        double max = grades[0];
        double min = grades[0];
        
        for(int i = 1; i<5; i++) {
            if(grades[i] > max) max = grades[i];
            if(grades[i] < min) min = grades[i];
        }
        
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        
    }
}

/*
Pertanyaan pemantik: 
1. Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100?
Jawab: Dari kode ini belum ada validasi angka selain 0 dan 100, jadi program tetap menghitung
jadi saya coba input 0, negatif, atau diatas 100, tetap dihitung rata-, tampil grade
ditmpilkan juga nilai max dan min nya.
2. Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
Jawab; Kalau jumlah nilai dinamis mungkin bisa dimodif jadi user yang nentukan berapa
nilai yang mau dimasukkan, mungkin bisa pakai scanner dan array, ajadi user input 3 misalnya
array nya jadi 3, lalu pakai perulangan yg mengikuti jumlah inputan user.
Lalu jika membatasi biar ga terima negatif atau diatas 100, digunakan validasi inputan
jadi kalau user masukkkan diluar 0 dan 100, prorgam minta user masukkan nilai ulng.
*/