/*
    Berikut ini macam-macam tipe data pada Java:
    char: Tipe data karakter, contoh Z
    int: angka atau bilangan bulat, contoh 29
    float: bilangan desimal, contoh 2.1
    double: bilangan desimal juga, tapi lebih besar kapasistanya, contoh 2.1
    String: kumpulan dari karakter yang membentuk teks, contoh Hello World!
    boolean: tipe data yang hanya bernilai true dan false

    Formatnya:
    <tipe data> namaVariabel;

    Contoh:
    Membuat variabel kosong bertipe integer: int namaVariabel;
    Membuat variabel bertipe integer dan langsung diisi nilai: int namaVariabel = 19;
    Membuat sekumpulan variabel yang tipe datanya sama: int a, b, c;

    Lalu, dimana itu ditulis:
    1. Di dalam fungsi main(): variabel yang ditulis di dalam fungsi main() dan fungsi yang lainnya disebut variabel lokal.
    2. Di dalam class: Variabel ini disebut variabel class atau global.

    Aturannya:
    1. Nama variabel tidak boleh menggunakan kata kunci dari Java (reserved word) seperti if, for, switch, dll.
    2. Nama variabel boleh menggunakan huruf, angka (0-9), garis bawah (underscore), dan symbol dollar ($), namun penggunaan garis bawah dan symbol lebih baik dihindari.
    3. Nama variabel harus diawali dengan huruf kecil, karena Java menggunakan gaya CamelCase.
    4. Apabila nama variabel lebih dari 1 suku kata, maka kata ke-2 dituliskan dengan diawali dengan huruf besar dan seterusnya, contoh namaVariabel.

 */

import java.util.Scanner;

public class _03JavaVariable {

    public static void main(String[] args) {

        /*
            Algoritme:
                Deklarasi:
                    Double luas, PI
                    int r
                Deskripsi:
                    - Input
                        PI = 3.14
                        r = 18
                    - Proses
                        luas = PI * r * r
                    - Output
                        cetak luas
         */

//        // Deklarasi
//        Double r, luas;
//        final Double pi = 3.14;
//
//        // Deskripsi
//        r = 10.0;
//
//        // Proses
//        luas = pi * r * r;
//
//        // Output
//        System.out.print("Luas Lingkaran = ");
//        System.out.println(luas);

        // deklarasi
        Double luas;
        int alas, tinggi;

        // mebuat scanner baru
        Scanner baca = new Scanner(System.in);

        // Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.print("Input alas: ");
        alas = baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi = baca.nextInt();

        // proses
        luas = Double.valueOf((alas * tinggi) / 2);

        // output
        System.out.println("Luas = " + luas);

    }
}
