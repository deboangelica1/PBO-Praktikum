/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjek;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class Geeks {
    static String name;
    static float price;
    
    static void set(String n, float p){
        name = n;
        price = p;
    }
    static void get()
    {
        System.out.println("Software name is: "+ name);
        System.out.println("Software price is: "+ price);
    }
    public static void main(String args[])
    {
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}
/*
inisialisasi objek disini menggunakan method/function
dengan membuat objek dlu menggunakan operator new, lalu
method yang bertugas dipanggil untuk mengatur nilai atribut 
variabel instance dari objek itu.
*/