/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject_clone;

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
public class Book implements Cloneable{
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
    public static void main(String[] args){
        try {
            Book b1 = new Book("java basics");
            Book b2 = (Book) b1.clone();
            
            System.out.println("judul buku b1: " + b1.getTitle());
            System.out.println("judul buku b2: " + b2.getTitle());
            System.out.println("apakah bb1 dan b2 objek yg sama?  " + (b1 == b2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
