/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjekdenganMethod;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Prodi   : DIV TRPL
Motto   : ORAET LABORA!
*/
public class Geeks { //buat class nama geeks
    static String name; //atribut class geeks
    static float price;
    
    static void set(String n, float p){  //method static utk isi nilai name dan price
        name = n;
        price = p; //simpan nilai parameter ke atribut class
    }
    static void get() //method static utl menampilkan nilai name dan price
    {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }
    
    public static void main(String args[])
    {
        Geeks.set("visual studio", 0.0f); //memanggil method set langsung mellui nama class dan isi data
        Geeks.get(); //panggil method get utk menampilkan data
    }
}
