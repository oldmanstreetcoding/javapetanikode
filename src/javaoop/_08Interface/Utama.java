/*
    Secara umum, interface berfungsi sebagai penghubung antara sesuatu yang ‘abstrak’ dengan sesuatu yang nyata.

    Tombol-tombol inilah yang dimaksud interface. Sementara isi dalam HP-nya, kamu tak peduli atau tak akan tahu
    seberapa kompleks dan abstrak sistem yang ada di sana.

    Saat kamu menekan tombol di HP mu, ada beberapa hal yang mungkin terjadi:
    HP menyala;
    HP mati;
    Suara HP tambah besar;
    Suara HP mengecil;
    Mengambil gambar dari kamera;
    dll.
 */
package javaoop._08Interface;

import java.util.Scanner;

public class Utama {

    public static void main(String[] args) {

        // membuat objek HP
        Phone redmi = new Xiaomi();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmi);

        // coba nyalain hp nya
        dian.turnOnThePhone();

        // biar fancy, kita buat programnya
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            String aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}
