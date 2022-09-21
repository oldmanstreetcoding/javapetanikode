/*
    Polimorfisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak “bentuk” method yang berbeda-beda
    meskipun namanya sama.

    Polimorfisme pada Java ada dua macam:
    1. Static Polymorphism (Polimorfisme statis);
    2. Dynamic Polymorphism (Polimorfisme dinamis).

    Beda dari keduanya terletak pada cara membuat polimorfismenya.
    Polimorfisme statis menggunakan method overloading sedangkan polimorfisme dinamis menggunakan method overriding.

    #Overloading
    Method overloading terjadi pada sebuah class yang memiliki nama method yang sama tapi memiliki parameter dan
    tipe data yang berbeda.

    Contohnya misalkan kita memiliki class Lingkaran.java. Pada class ini terdapat method luas().
    Nah, si method luas() ini bisa saja memiliki parameter yang berbeda.
    Misalnya kita ingin menghitung luas berdasarkan jari-jari (radius) atau diameter.
    Class Lingkaran memiliki dua method yang namanya sama, yakni luas().
    Tapi parameter dan tipe datanya berbeda..
    ..dan juga isi atau rumus di dalamnya berbeda.
    Inilah yang disebut polimorfisme satatis.

    #Overriding
    Plimorfisme dinamis biasanya terjadi saat kita menggunakan pewarisan (inheritance) dan implementasi interface.
    Pada pewarisan, kita bisa mewariskan atribut dan method dari class induk ke class anak.
    Class anak akan memiliki nama method yang sama dengan class induk dan anak yang lainnya.

    Class anak akan memiliki nama method yang sama, tapi nanti isi dan parameternya bisa berbeda dari class induk.
    Karena si class anak melakukan method overriding (mendindih method) yang diwariskannya.

    Jadi polimorfisme statis hanya terjadi dalam satu class saja.
    Sedangkan polimorfisme dinamis terjadi pada saat ada hubungan dengan class lain seperti inheritance.
 */
package javaoop._07Polymorphism;

public class Utama {

    public static void main(String[] args) {

        String emailPenerima = "A@gmail.com";
        String noHP = "08080808080";

        EmailNotification emailNotification = new EmailNotification();
        SmSNotification smSNotification = new SmSNotification();

        String message = "Welcome New Member";

        emailNotification.sendMessage(emailPenerima, message);
        smSNotification.sendMessage(noHP, message);
    }
}
