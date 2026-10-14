/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassdanObject;

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
class Student { //dibuat class bernama student
    int id; //ini merupakan atribut yang dimiliki class student
    String n;
    
    public Student(int id, String n) { //disebut constructor yg gunanya memberi nilai awal pd class
        this.id = id; //memsukkan nilai id yg diberi ke atribut id
        this.n = n;
    }
}
public class Main { //program utama utk menjalankan
    public static void main(String[] args){
        Student s1 = new Student(10, "Alice"); //buat objek baru namanya s1 dari class student
        //dengan id 10 dan nama alice
        
        System.out.println(s1.id); //menampilkan id
        System.out.println(s1.n); //menampilkan nama
    }
}

/*
Class di java ini disebut blueprint yang gunanya untuk membuat entitas benda nyata 
yang nantinya disebut object yang punya karateristik dan properti sama.
*/
