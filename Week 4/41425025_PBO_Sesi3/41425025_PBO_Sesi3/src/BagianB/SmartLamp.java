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
//program lampu pintar

//class SmartLamp ikut aturan yang ada di interface Switchable dan Connectable
public class SmartLamp implements Switchable, Connectable{
    //atribut
    private int brightness;
    private boolean isOn;
    //sebuah construct
    public SmartLamp(int brightness){
        this.brightness = brightness;
        this.isOn = false; //false krna pas pertama kali lampu dianggap belum nyala
    }
    @Override
    public void turnOn() { //sebuah method turnOn
        isOn = true; //status lampu berubah ketika method ini dijalankan

        System.out.println("Smart Lamp menyala.");
        System.out.println("Kecerahan: " + brightness + "%");
    }
    @Override
    public void turnOff() { //method turnOff
        isOn = false; //kalau lampu turnOff status berubah 
        System.out.println("Smart Lamp mati.");
    }
    public void connectToWifi(String ssid, String ipAddress) { //method connectToWiffi yang menerima data ssid dan ipAdress
        //kondisi perangkat harus menyala dulu
        if (!isOn) {
            System.out.println(
                    "Error: Smart Lamp harus menyala "
                    + "sebelum terhubung ke WiFi."
            );
            return; //kalau kondisi ini benar stop disini
        }
         System.out.println("Smart Lamp terhubung ke WiFi."
        );
        System.out.println("SSID: " + ssid);
        System.out.println("IP  : " + ipAddress);
    }
    @Override
    public void connectToWiffi(String ssid, String ipAddress) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
