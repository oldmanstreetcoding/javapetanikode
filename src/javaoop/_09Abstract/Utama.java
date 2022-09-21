/*
    Class abstrak adalah class yang masih dalam bentuk abstrak. Karena bentuknya masih abstrak, dia tidak bisa dibuat
    langsung menjadi objek.
    Sebuah class agar dapat disebut class abstrak setidaknya memiliki satu atau lebih method abstrak.
    Method abstrak adalah method yang tidak memiliki implementasi atau tidak ada bentuk konkritnya.

    Cara membuat class abstrak menjadi konkrit adalah dengan membuat implementasi dari method-method yang masih abstrak.
    Ini bisa kita lakukan dengan pewarisan (inheritance).
    Class abstrak biasanya digunakan sebagai class induk dari class-class yang lain. Class anak akan membuat versi
    konkrit dari class abstrak.

    Pada suatu kondisi tertentu, class induk tidak ingin kita buat sebagai objek.. karena kode methodnya belum jelas
    mau diimplementasikan seperti apa.Maka class ini sebaiknya dijadikan abstrak.

    Cara membuat class abstrak adalah dengan memberikan kata kunci abstract kepada class dan method yang ingin
    dijadikan abstrak.

    Beda abstract dan interface:

    1. di class abstrak kita bisa baut properti atau variabel sedangkan di interface kita cuma bisa buat konstanta saja
    2. di class abstrak kita bisa implementasikan kode method seperti class biasa, sedangkan di interface harus menggunakan default
    3. di class abstrak dapat memiliki member private dan protected sedangkan interface harus publik semua
    4. Class abstrak diimpelentasikan dengan pewarisan (extends) sedangkan interaface menggunakan implements

 */
package javaoop._09Abstract;

public class Utama {

    public static void main(String[] args) {

        // buat objek triangle
        Shape segitiga = new Triangle(4, 5);

        // buat objek lingkatan
        Shape lingkaran = new Circle(10);

        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkatan: " + segitiga.getArea());
    }
}
