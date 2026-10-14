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
Nama    : Debora Angelika Saragih
NIM     : 41425025
Motto   : ORAET LABORA!
*/
import java.util.Scanner;
public class LoginBerlapis {
    public static void main(String[] args) {
        
        //untuk menerima inputan dari user
        Scanner input = new Scanner(System.in);

        // untuk settingan username dan password yg benar
        String usernameBenar = "debora";
        String passwordBenar = "debora262304";

        //membuat perulangan max 3 x
        for (int coba = 1; coba <= 3; coba++) {
            System.out.println("\n Sistem Login");
            System.out.println("Percobaan " + coba + ":");

            //meminta username dimasukkan user
            System.out.print("Username: ");
            String username = input.nextLine();

            //untuk validasi jumlah karakter username menggunakan length(hitung jumlah karakter)
            if (username.length() < 5 || username.length() > 10) {
            System.out.println("Login gagal! Username harus 5-10 karakter.");
            
            //kondisi kalu udh 3x coba gagal
             if(coba == 3){
                System.out.println("Akun terkunci! Terlalu banyak percobaan gagal");
            }
            continue;
        }    
            //untuk meminta inputan password 
            System.out.print("Password: ");
            String password = input.nextLine();

            //cek apssword mengandung angka atau tidak
            boolean Angka = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    Angka = true;
                    break;
                }
            }

            //memvalidasi password
            if (password.length() < 8 || !Angka) {
                System.out.println("Login gagal! Password harus minimal 8 karakter " + "dan mengandung angka.");
                
                //kondisi jika udh 3x percobaan
                if(coba == 3){
                    System.out.println("Akun terkunci! terlalu banyak percobaan gagal");
            }
                continue;
                
            }
            //cek username dan password
            if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Login gagal! Username atau password salah.");

                //kondisi kalau udh 3x percobaan
                if (coba == 3) {
                    System.out.println( "Akun terkunci! Terlalu banyak percobaan gagal.");
                }
            }
        }

        input.close(); //untuk nutup scanner yang tadi dibuat, karena scanner
                      //menggunakan resource sistem utk baca input, jd kalau udh selesai dikembalikan resourcenya.
    }
}


