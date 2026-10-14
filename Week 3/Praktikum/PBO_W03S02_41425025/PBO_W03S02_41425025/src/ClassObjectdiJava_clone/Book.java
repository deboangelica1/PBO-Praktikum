/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObjectdiJava_clone;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class Book implements Cloneable {
    private String t;
    public Book(String t) {
        this.t = t;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public String getTitle() {
        return t;
    }
    public static void main(String[] args) {
        try {
            Book b1 = new Book("Java basics");
            Book b2 = (Book) b1.clone();
            
            System.out.println("Judul buku b1: " + b1.getTitle());
            System.out.println("Judul buku b2: " + b2.getTitle());
            System.out.println("Apakah b1 dan b2 objek yang sama? " +(b1 == b2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
