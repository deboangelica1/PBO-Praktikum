/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassdanObject;

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
public class Dog { //sebuah class bernama Dog
    String name; //name,breed,age,color merupakan sebuah atribut
    String breed;
    int age;
    String color;
    
    public Dog(String name, String breed, int age, String color) //construct sebuah nilai awal pd atribut
    {
        this.name = name; //memasukkan nilai parameter ke atribut
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    //method getName
    public String getName(){
        return name;
    }
    //method getBreed
    public String getBreed(){
        return breed;
    }
    //method getAge
    public int getAge(){
        return age;
    }
    //method getColor
    public String getColor(){
        return color;
    }
    //keseluruhan method getter itu untuk mengambil/mengemblaikan nilai atribut
    
    @Override public String toString() //override menandakan tostring meng-override method tostring bawaan dari java
    {
        return ("Name is: " + this.getName() //format outputnya nnti
                +"\nBreed, age, and color are: " 
                + this.getBreed() + "," + this.getAge()
                +"," + this.getColor());
    }
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white"); //dibuat object baru bernama tuffy dari class dog
        System.out.println(tuffy.toString()); //menampilkan informasi object tuffy
    }
}
/*
Ini merupaka contoh kode utk membuat sebuah class, diamna utk membuat object pakai operator new
*/
