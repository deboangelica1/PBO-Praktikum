/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuatObjek_Reflection;

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
class Student{
    public Student() {}
}
public class Main {
    public static void main(String[] args){
        try {
            Class<?> c = Class.forName("student");
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created " +s2);
        } catch (ClassNotFoundException e) {
            System.err.println("class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("no default constructor!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
