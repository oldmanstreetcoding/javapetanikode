/*
    Class dalam program Java dapat saling berhubungan dengan cara memberikan akses terhadap member mereka.
    Salah satu hubungan class yang pernah kita pelajari adalah inheritance (pewarisan).
    Semua yang ada di dalam class (atribut dan method) disebut member. Biasanya akan ada tingkatan akses yang
    disebut modifier. Pada hubungan inheritance, semua member di dalam class induk akan bisa diakses oleh class
    anak (subclass), kecuali memeber tersebut diberikan modifier private.

    Secara umum ada 3 macam modifier yang digunakan dalam Java: public, private, dan protected. Apabila kita tidak
    menggunakan tiga kata kunci tersebut, maka member atau class itu tidak menggunakan modifier (no modifier).

    Apabila kita tidak menggunakan modifier (no modifier), maka class dan member hanya akan bisa diakses dari Class
    itu sendiri dan package (class yang berada satu package dengannya).

    #Public
    Agar bisa diakses dari mana saja, maka kita harus memberikan modifier public.

    Class Person berada di dalam package modifier, lalu kita coba akses dari default package, maka yyang akan terjadi
    adalah error seperti gambar di atas. Bagaimana solusinya agar bisa diakses dari luar package?
    Ya kita harus menambahkan modifier public ke dalam class Person.

    Pada class diagram, modifier public digambarkan dengan simbol plus (+).

    #Private
    Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
    Modifier private tidak bisa diberikan kepada class, enum, dan interface. Modifier private hanya bisa diberikan
    kepada member class.

    Lalu, bagaimana cara mengakses member private dari luar class? Kita bisa memanfaatkan method setter dan getter.
    Karena, method ini akan selalu diberikan modifier public.

    Pada class diagram, modifier private digambarkan dengan simbol minus (-).

    #Protected
    Modifier protected akan membuat member dan class hanya bisa diakses dari:

    1. Class itu sendiri;
    2. Sub class atau class anak;
    3. Package (class yang berada satu package dengannya).

    Modifier protected juga hanya boleh digunakan pada member saja.

    Apabila kita coba mengakses dari class yang satu package dengannya, maka tidak akan terjadi error.Namun, apabila
    kita mencoba mengakses dari luar package seperti ini, Maka akan terjadi error.

 */
package javaoop._03Modifier;

public class Utama {
}
