/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concurrency_methods;

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
class AntreanShared {
    private String data;
    private boolean adaData = false;
    
    public synchronized void kirimPesan(String pesan) {
        while (adaData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.data = pesan;
        this.adaData = true;
        System.out.println("pesan dikirim: " + pesan);
        notify();
    }
    public synchronized String ambilPesan() {
        while (!adaData) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.adaData = false;
        System.out.println("pesan diterima: " + data);
        
        notify();
        return data;
    }
}
public class MainConcurrency {
    public static void main(String[] args) {
        AntreanShared antrean = new AntreanShared();
        
        Thread produsen = new Thread(() -> {
            String[] listPesan = {"halo", "belajar java", "selesai"};
            for (String p: listPesan) {
                antrean.kirimPesan(p);
            }
        });
        
        Thread konsumen = new Thread (() -> {
            for (int i = 0; i < 3; i++) {
                antrean.ambilPesan();
            }
        });
        produsen.start();
        konsumen.start();
    }
}
