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
//program ini hampir sama dgn smartLamp
public class SmartAC implements Switchable, Connectable {

    //atribut
    private double temperature;
    private boolean isOn;

    //sebuah construct
    public SmartAC(double temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Smart AC menyala.");
        System.out.println("Suhu: " + temperature + " C");
    }
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Smart AC mati.");
    }
    public void connectToWifi(String ssid, String ipAddress) {
        //gbisa terhubung kalau perangkatnya mati
        if (!isOn) {
            System.out.println("Error: Smart AC harus menyala " + "sebelum terhubung ke WiFi.");
            return;
        }
        System.out.println("Smart AC terhubung ke WiFi.");
        System.out.println("SSID: " + ssid);
        System.out.println("IP  : " + ipAddress);
    }

    @Override
    public void connectToWiffi(String ssid, String ipAddress) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
