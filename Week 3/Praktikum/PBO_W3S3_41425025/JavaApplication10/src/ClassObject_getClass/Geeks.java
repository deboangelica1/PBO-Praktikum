/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassObject_getClass;

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
public class Geeks {
    public static void main(String[] args)
    {
        Object o = new String("Geeksforgeeks");
        Class c = o.getClass();
        System.out.println("class of object o is: " + c.getName());
    }
}
