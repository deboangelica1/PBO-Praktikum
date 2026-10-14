/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.week.pkg2.git;

/**
 *
 * @author debo
 */
public class OperatorJava {
    //contoh penggunaan operator
    int sum = 3+4;
    int diff =  10-3;
    int prod = 7*3;
    double q = 20.0/3;
    int r = 7%3;
    
    //compound assignment
    int x = 10;
    x += 5; //x=15
    
    //dampak tipe data
    double d = 10.0/3; //3.333
    int i = 10/3; //3
    
    //pada ekspresi campuran, tipe lebih keccil dipromosikan
    //misal int->double. Math utility
    double p = Math.pow(2, 3);
    double s = Math.sqrt(64);
    
    //operator == != > <> >= -> hasil boolean
    int a = 5;
    boolean ok = (a == 5);
    
    //operator AND, OR, NOT
    boolean r1 = (5>3) && (7<10);
    boolean r2 = (5<3) || (7<10);
    boolean r3 = !(5>3);
    
    //operator: bitwise (untuk integer); &|^~<< >>
    int and = 5 & 3;
    int or = 5 | 3;
    int xor = 5 ^3;
}
