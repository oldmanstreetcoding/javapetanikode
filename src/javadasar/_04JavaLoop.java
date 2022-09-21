/*
    Perulangan dalam pemrograman dibagi manjadi dua jenis:
    1. Counted loop: Perulangan yang jumlah pengulangannya terhitung atau tentu.
    2. Uncounted loop: Perulangan yang jumlah pengulangannya tidak terhitung atau tidak tentu.
 */

import java.util.Scanner;

public class _04JavaLoop {

    public static void main(String[] args) {

        // For Each sample:
        // make array
//        int angka[] = {3,1,42,24,12};
//
//        // use for each
//        for (int x : angka)
//            System.out.print(x + " ");

        // While loop sample:
        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    }
}
