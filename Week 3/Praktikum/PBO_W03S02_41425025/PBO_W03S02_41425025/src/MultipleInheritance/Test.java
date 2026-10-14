/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MultipleInheritance;

/**
 *
 * @author debo
 */
/*
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
interface LandVehicle {
    default void landInfo() {
        System.out.println("This is a landvehicle");
    }
}
interface WaterVehicle{
    default void waterInfo() {
        System.out.println("This is a WaterVehicle");
    }
}
clas AmphibiousVehicle impelments LandVehicle, WaterVehicle {
AmphibiousVehicle() {
System.out.println("This is an AmphibiousVehicle");
}
}
public class Test {
    public static void main(String[] args) {
        AmphibiousVehicle obj = new AmphibiousVehicle();
        obj.waterInfo();
        obj.landInfo();
    }
}
