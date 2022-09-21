/*
    Seperti yang sudah kita pelajari pada tulisan sebelumnya: sebuah class atau objek bisa saling berhubungan dengan
    class yang lain. Salah satu bentuk hubungannya adalah inheritance (pewarisan). Hubungan ini seperti hubungan
    keluarga antara orang tua dan anak.

    Sebuah class di Java, bisa memiliki satu atau lebih keturunan atau class anak. Class anak akan memiliki warisan
    properti dan method dari class ibu.

    Pada class anak, kita menggunakan kata kunci extends untuk menyatakan kalau dia adalah class turunan dari Enemy.

    Karena yang kita panggil sebenarnya adalah method luas() dan keliling() milik si induk (BangunDatar).
    Objek anak dari BangunDatar belum memiliki method luas() dan keliling(), akhirnya mengambil milik induknya.
    Lalu bagaimana kalau kita ingin membuat agar semua class anak memiliki method luas() dan keliling() yang
    berbeda dari induk?
    Jawabanya: menggunakan method overriding.

 */
package javaoop._02InheritanceOverriding;

public class Utama {

    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        lingkaran.luas();
        lingkaran.keliling();

        persegiPanjang.luas();
        persegiPanjang.keliling();

        segitiga.luas();

    }

}
