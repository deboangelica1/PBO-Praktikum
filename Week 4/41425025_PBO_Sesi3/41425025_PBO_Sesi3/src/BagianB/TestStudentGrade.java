/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author debo
 */
public class TestStudentGrade {
      public static void main(String[] args) {
        StudentGrade mahasiswa = new StudentGrade("41425025", "Debora");

        mahasiswa.setNilaiKuis(85);
        mahasiswa.setNilaiUTS(90);
        mahasiswa.cetakData();
        System.out.println();
        mahasiswa.setNilaiKuis(120);
    }
}
