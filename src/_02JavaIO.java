/*
    Input:
    1. Class Scanner;
    2. Class BufferReader;
    3. Class Console.

    Output:
    1. Fungsi System.out.print()
    2. Fungsi System.out.println()
    3. Fungsi System.out.format() / System.out.printf

    Fungsi print() akan menampilkan teks apa adanya. Sedangkan println() akan menampilkan teks dengan ditambah baris baru.

    System.out.format("Nama saya %s %s %n", namaDepan, namaBelakang);

    %d untuk desimal atau angka;
    %f untuk bilangan pecahan;
    %n untuk baris baru, bisa juga pakai \n;

 */

//import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

import java.io.Console;

public class _02JavaIO {

//    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {

    // 1. Class Scanner;
//        // variable declaration
//        String nama, alamat;
//        int usia, gaji;
//
//        // membuat scanner baru
//        Scanner keyboard = new Scanner(System.in);
//
//        // Tampilkan output ke user
//        System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
//        System.out.print("Nama karyawan: ");
//        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
//        nama = keyboard.nextLine();
//        // Tampilkan outpu lagi
//        System.out.print("Alamat: ");
//        // menggunakan scanner lagi
//        alamat = keyboard.nextLine();
//
//        System.out.print("Usia: ");
//        usia = keyboard.nextInt();
//
//        System.out.print("Gaji: ");
//        gaji = keyboard.nextInt();
//
//
//        // Menampilkan apa yang sudah simpan di variabel
//        System.out.println("--------------------");
//        System.out.println("Nama Karyawan: " + nama);
//        System.out.println("Alamat: " + alamat);
//        System.out.println("Usia: " + usia + " tahun");
//        System.out.println("Gaji: Rp " + gaji);

        // 2. Class BufferReader;
//        String nama;
//
//        // Membuat objek inputstream
//        InputStreamReader isr = new InputStreamReader(System.in);
//
//        // membuat objek bufferreader
//        BufferedReader br = new BufferedReader(isr);
//
//        // Mengisi varibel nama dengan Bufferreader
//        System.out.print("Inputkan nama: ");
//        nama = br.readLine();
//
//        // tampilkan output isi variabel nama
//        System.out.println("Nama kamu adalah " + nama);

        String nama;
        int usia;

        // membuat objek console
        Console con = System.console();

        // mengisi variabel nama dan usia dengan console
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());

        // mengampilkan isi variabel nama dan usia
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");

    }
}
