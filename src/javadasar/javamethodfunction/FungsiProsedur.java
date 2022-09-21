/*
    Program ini adalah program sederhana dengan fitur sebagai berikut:
    1. Baca data dari ArrayList
    2. Simpan data ke ArrayList
    3. Ubah data
    4. Hapus Data
    5. Keluar

 */
package javamethodfunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedur {

    // global variable
    static ArrayList listBuah = new ArrayList(); // menyimpan nama-nama buah
    static boolean isRunning = true; // membuat loop
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader); // ambil input dari keyboard

    static void showMenu() throws IOException {

        // throws IOException: wajib ada karena menggunakan BufferedReader

        /*
            Fungsi tersebut bertugas untuk menampilkan menu dan menentukan fungsi mana yang akan dipanggil berdasarkan
            nomer menu yang diinputkan.
         */

        System.out.println("\n========= MENU =========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch (selectedMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.out.println("Thank You!");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    }

    /*
        Fungsi tersebut bertugas menampilkan isi dari listBuah. Kalau listBuah kosong, maka akan ditampilkan
        pesan "Belum ada data".
     */
    static void showAllBuah(){
        if(listBuah.isEmpty()){
            System.out.println("Belum ada data");
        } else {
            // tampilkan semua buah
            for (int i = 0; i < listBuah.size(); i++){
                System.out.printf("[%d] %s\n", i, listBuah.get(i));
            }
        }
    }

    /*
        Pada fungsi tersebut, kita menggunakan method listBuah.add(namaBuah); untuk menambah data ke dalam listBuah
        berdasarkan namaBuah yang diberikan.
     */
    static void insertBuah() throws IOException {
        System.out.print("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }

    /*
        Pertama kita perlu tampilkan dulu daftar buahnya, lalu kita minta user untuk memilih buah mana yang akan diedit.
        Setelah itu, kita update buahnya dengan method listBuah.set(indexBuah, namaBaru);.
     */
    static void editBuah() throws IOException {
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());

        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();

        // ubah nama buah
        listBuah.set(indexBuah, namaBaru);
    }

    /*
        Hampir sama seperti edit buah, untuk menghapus buah kita juga butuh nomer indeks buah yang akan dihapus.
        Lalu mengapusnya dengan method listBuah.remove(indexBuah);.
     */
    static void deleteBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());

        // hapus buah
        listBuah.remove(indexBuah);
    }

    public static void main(String[] args) throws IOException{

        do {
            showMenu();
        } while (isRunning);

    }
}
