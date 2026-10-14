/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultilevelInheritance;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle{
    FourWheeler() {
        System.out.println("4 wheeler vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 wheeler vehicle is a 4 char");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Car obj = new Car();
    }
    
}
