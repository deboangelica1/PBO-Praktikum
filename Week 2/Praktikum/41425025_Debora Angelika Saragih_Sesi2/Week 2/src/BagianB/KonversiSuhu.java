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
public class KonversiSuhu {
    public static void main(String[] args) {
        
        //untuk menerima input dari user
        Scanner input = new Scanner(System.in);
        
        //untuk input suhu yag Celcius
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        
        //untuk ubah suhu celcius ke fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        //menampilkan hasil celcius lalu diubah ke fahrenheit
        System.out.println(celsius + " C = " + fahrenheit + " F");
        
        //input suhu fahrenheit
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheitInput = input.nextDouble();
        
        //ubah fahrenheit ke celcius
        double celsiusHasil = (fahrenheitInput - 32) * 5 / 9;
        
        //hasilnya ditampilkan
        System.out.printf("%.1f F = %.2f C%n", fahrenheitInput, celsiusHasil);
    }
}
