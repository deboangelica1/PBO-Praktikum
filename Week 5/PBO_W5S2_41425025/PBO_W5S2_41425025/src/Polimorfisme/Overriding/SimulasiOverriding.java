/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.Overriding;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
class KurirReguler { //class induk
    protected String nama; //atribut classnya
    public KurirReguler(String nama){
        this.nama = nama;
    }
    public void kirimBarang(String alamat){ //method dari class itu namanya kirimBarang
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

class KurirDrone extends KurirReguler { //class anak extend class induk
    private String idDrone; //atribut class anak
    
    public KurirDrone(String nama, String idDrone){ 
        super(nama);
        this.idDrone = idDrone;
    }
    
    @Override
    public void kirimBarang(String alamat){ //method kirimBarang dgn parameter string alamat, sama dgn method di class induk
        //sesuai konsep overriding, method dan parameter boleh sama tp dr class beda atau turunan dr class induk ke class anak
        System.out.println("unit drone [" + idDrone + "] operator " + nama + " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}
public class SimulasiOverriding {
    public static void main(String[] args){
        System.out.println("INI METHOD OVERRIDING");
        
        KurirReguler k1 = new KurirReguler("Budi");
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");
        
        k1.kirimBarang("Jl.Sudirman No. 10");
        k2.kirimBarang("gedung graha lt. 5");
    }
}

/*
Pertanyaan Analisis:
1. Pada class KurirDrone, hapus atau jadikan komentar baris @Override. Kemudian, ubah nama
method di bawahnya secara sengaja menjadi salah ketik, misalnya: public void
kirimbarang(String alamat) (menggunakan huruf 'b' kecil)

2. Jalankan SimulasiOverriding.java. Apa output yang tercetak dari k2.kirimBarang("Gedung
Graha Lt. 5")? Apakah masih "lewat jalur udara" atau berubah menjadi "lewat jalur darat"?
Jawab:
outputnya  
Error: Could not find or load main class Polimorfisme.Overriding.SimulasiOverriding
Caused by: java.lang.ClassNotFoundException: Polimorfisme.Overriding.SimulasiOverriding
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

3. Sekarang kembalikan tulisan @Override di atas method yang salah ketik tersebut, lalu kompilasi
ulang. Salin pesan error yang muncul!
Jawab:
run:
Error: Could not find or load main class Polimorfisme.Overriding.SimulasiOverriding
Caused by: java.lang.ClassNotFoundException: Polimorfisme.Overriding.SimulasiOverriding
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\debo\AppData\Local\NetBeans\Cache\24\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

4. Berdasarkan eksperimen di atas, jelaskan dengan bahasa Anda sendiri apa fungsi utama dari tulisan
@Override bagi seorang programmer!
Jawab: 
fungsi utamanya menjadi penanda bahwa method yg dibuat di class turunan sengaja 
menggantikan method dari class induknya. Pada class KurirReguler kan juga ada method kirimBarang,
nah di KurirDrone dibuat lagi jadi kaya didefinsiikan pakai method itu tapi dari class kurirdrone bukan reguler.
Jadi override itu juga membantu compiler utk cek overridingnya, misal di class induk methodnya kan String Alamat
tapi di childnya kita buat int Alamat, jadi akan error karna method nya beda bukan itu yg dioverride.

*/