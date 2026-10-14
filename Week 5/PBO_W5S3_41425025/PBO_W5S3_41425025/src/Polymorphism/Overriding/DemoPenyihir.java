/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.Overriding;

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

class Penyihir {
    public void ucapkanMantra(){
        System.out.println("mengucapkan mantra dgn cara biasa");
    }
}

class HarryPotter extends Penyihir{
    
    public void ucapkanMantra(){
        System.out.println("harry potter mengucapkan mantra dgn tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir{
    
    public void ucapkanMantra(){
        System.out.println("hermione mengucapkan mantra dgn tepat dan percaya diri");
    }
}
//menambahkan class ronewasley
class RonWeasley extends Penyihir{
    public void ucapkanMantra(){
        System.out.println("ron weasley mengucapkan mantra dgn mengayun-ayunkan tongkatnya sambil menaik-turunkan tangan secara kaku");
    }
}
public class DemoPenyihir {
    public static void main(String[] args){
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();
        
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}
/*
Pertanyaan:
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih
berjalan?
Jawab: 
kalau kuhapus program ttp bisa jalan @Override itu bukan sintaks wajib
tp seperti pelindung atau pendeteksi kesalahan yg akan memberitahu
kompiler: bahwasanya ada kesalhan yg menimpa metod kelas parent, jadi disuruh periksa

2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
jawab:
lebih singkat kode, karena tidak perlu lagi definisikan satu per satu method di tiap class penyihir harry potter
ataupun hermione, jadibisa seragam yaitu extends dari class induk, jadi tinggal buat class baru tanpa perlu
otak atik sistem
*/
