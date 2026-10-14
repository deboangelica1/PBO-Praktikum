/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author debo
 */
/*
Nama    :Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
public class TestSmartHome {
     public static void main(String[] args) {
        //buat objek smartlamp
        SmartLamp lamp = new SmartLamp(80);

        //coba hubungkan lampiu ketik mmati
        lamp.connectToWifi("WiFi-ITDel", "192.168.1.10");
        System.out.println();

        //menyalakan lampu.
        lamp.turnOn();

        //kalau udh menyala, baru boleh terhubung WiFi.
        lamp.connectToWifi("WiFi-ITDel", "192.168.1.10");

        //matikan lampu.
        lamp.turnOff();
        System.out.println();
        //buat objek Smart AC.
        SmartAC ac = new SmartAC(22);
        //menyalakan AC.
        ac.turnOn();
        //menghubungkan AC ke WiFi.
        ac.connectToWifi("WiFi-ITDel", "192.168.1.11");
         //matikan AC.
        ac.turnOff();
    }
}
