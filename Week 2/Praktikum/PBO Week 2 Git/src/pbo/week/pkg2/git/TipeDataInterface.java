/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pbo.week.pkg2.git;

/**
 *
 * @author debo
 */
public interface TipeDataInterface {
    //interface
    interface Operasi {
        int tambah(int a, int b);
    }
    class Kalkulator implements Operasi {
        public int tambah(int a, int b) {return a+b;}
    }
}
