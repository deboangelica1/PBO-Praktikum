/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author debo
 */

/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
import java.util.ArrayList;
import java.util.List;
//buat abstract class
abstract class MantraPerlindungan{ //sebuah class abstract atau class induk 
    public abstract void aktfikan();
    public abstract void nonaktifkan();
}

//class protego
class Protego extends MantraPerlindungan{ //class anakn
    public void aktifkan(){
        System.out.println("Perisai Protego terbentuk!");
    }
    
    @Override
    public void nonaktifkan(){
        System.out.println("protego nonaktif");
    }
}

//class fidelius
class Fidelius extends MantraPerlindungan{
    private String secretKeeper;
    public Fidelius(String secretKeeper){
        this.secretKeeper = secretKeeper;
    }
    public void aktifkan(){
        System.out.println("mantra Fidelius aktif. Secret Keeper: " + secretKeeper);
    }
    @Override
    public void nonaktifkan(){
        System.out.println("fidelius nonaktif");
    }
}

//class mantra anti apparition
class MantraAntiApparition extends MantraPerlindungan{
    private String area;
    public MantraAntiApparition(String area){
        this.area = area;
    }
   
    public void aktifkan(){
        System.out.println("mantra anti apparition di area "+ area + " apparition dicegah");
    }
    @Override
    public void nonaktifkan(){
        System.out.println("mantra anti apparition dinonaktifkan di area" + area);
    }
}

//buat class sistem pertahanan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra; //bisamenampung byk mantra
    
    public SistemPertahanan(){
        daftarMantra = new ArrayList<>();
    }
    public void tambahMantra(MantraPerlindungan mantra){
        daftarMantra.add(mantra);
        System.out.println("mantra berhasil ditambah");
    }
    public void aktifkanSemuaMantra(){
        System.out.println("MENGAKTIFKAN PERTAHANAN HOGWARTS");
        for (MantraPerlindungan mantra : daftarMantra){
            mantra.aktifkan();
        }
    }
    public void nonaktifkanSemuaMantra(){
        System.out.println("NONAKTIF SMEUA MANTRAA");
        for (MantraPerlindungan mantra : daftarMantra){
            mantra.nonaktifkan();
        }
    }
}
public class SistemPertahananHogwarts {
    public static void main(String[] args){
        
        SistemPertahanan hogwarts = new SistemPertahanan();
        
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("albus dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("hogwarts");
        
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);
        
        hogwarts.aktifkanSemuaMantra();
        hogwarts.nonaktifkanSemuaMantra();
    }
}
