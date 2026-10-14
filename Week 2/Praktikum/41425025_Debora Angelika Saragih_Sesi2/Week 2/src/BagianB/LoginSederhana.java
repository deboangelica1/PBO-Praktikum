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
NIM     : 41425025
Nama    : Debora Angelika Saragih
Motto   : ORAET LABORA
*/
import java.util.Scanner;
public class LoginSederhana {
    public static void main(String[] args) {
        
        //untuk menerima input dr user
        Scanner input = new Scanner(System.in);
        
        //minta user masukkan username
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        
        //minta user masukkan password
        System.out.print("Masukkan password: ");
        String password = input.nextLine();
        
        //untuk cek passowrd hrus punya 6 karakter minimal
        boolean panjangPassword = password.length() >= 6;
        
        //cek password mengandung angka
        boolean mengandungAngka = password.matches(".*\\d.*");
        
        //kondisi untuk cek username dan password
        if (username.equals("admin") && panjangPassword && mengandungAngka) {
            System.out.println("Login berhasil!");
        } else if (!username.equals("admin")) {
            System.out.println("Login gagal! Username tidak valid.");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }
    }
}
