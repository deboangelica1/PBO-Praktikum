/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author debo
 */
public class Organisasi {

    // Atribut
    String kahim;
    int jumlah_anggota;

    // Method 1
    void tutor() {
        System.out.println(kahim + " sedang melakukan tutor.");
    }

    // Method 2
    void welpart() {
        System.out.println("Organisasi " + kahim + " sedang melakukan welpart.");
    }

    public static void main(String[] args) {

        // Object 1
        Organisasi HIMATERA = new Organisasi();
        HIMATERA.kahim = "Debora";
        HIMATERA.jumlah_anggota = 30;

        // Object 2
        Organisasi HIMAMERA = new Organisasi();
        HIMAMERA.kahim = "Grace";
        HIMAMERA.jumlah_anggota = 25;

        // Menampilkan Object HIMATERA
        System.out.println("HIMATERA");
        System.out.println("Kahim           : " + HIMATERA.kahim);
        System.out.println("Jumlah Anggota  : " + HIMATERA.jumlah_anggota);
        HIMATERA.tutor();
        HIMATERA.welpart();

        // Menampilkan Object HIMAMERA
        System.out.println("\nHIMAMERA");
        System.out.println("Kahim           : " + HIMAMERA.kahim);
        System.out.println("Jumlah Anggota  : " + HIMAMERA.jumlah_anggota);
        HIMAMERA.tutor();
        HIMAMERA.welpart();
    }
}
