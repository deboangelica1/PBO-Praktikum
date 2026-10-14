/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingleInheritance;

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
//sublass
class Car extends Vehicle{
    Car(){
        System.out.println("This vehicle is car");
    }
}
public class Test {
    public static void main(String[] args) {
        Car obj = new Car();
    }
}
