/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava_toString;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class Student {
    @Override
    public String toString() {
        return "Student object";
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.toString());
    }
}
/*metode ini menyediakan string dari sebuah objek dan digunakan untuk
mengkonversi objek menjadi string. Metode toString di kelas object, akan 
mengembalikan sebuah string yang terdiri dari nama class tempat objjek itu dibuat.
*/
