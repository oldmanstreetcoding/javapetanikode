/*
    HashMap bisa dibilang seperti Array asosiatif dalam Java.
    HashMap adalah sebuah class yang berisi sekumpulan pasangan nilai (value) dan kunci (key).

    contoh: HashMap<Integer, String> days = new HashMap<Integer,String>

    Untuk mengisi nilai ke objek days, kita dapat menggunakan method put seperti ini:

    Method lain:
    - clear() untuk membersihkan isi HashMap;
    - isEmpty() untuk mengecek apakah HashMap dalam keadaan kosong atau tidak;
    - size() untuk mengambil ukuran HashMap (jumlah item di dalam hashmap);
    - values() untuk mengambil semua nilai yang ada di dalam HashMap;
    - keySet() untuk mengambil semua key yang ada di dalam HashMap;
    - clone() untuk menggandakan objek HashMap;

 */

import java.util.HashMap;
import java.util.Map;

class Buku {

    private String title;
    private String author;

    public Buku(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

public class _06JavaHashMap {

    public static void main(String[] args) {

//        // membuat objek hashmap
//        HashMap<Integer, String> days = new HashMap<Integer,String>();
//
//        // mengisi nilai ke objek days
//        days.put(1, "Minggu");
//        days.put(2, "Senin");
//        days.put(3, "Selasa");
//        days.put(4, "Rabu");
//        days.put(5, "Kamis");
//        days.put(6, "Jum'at");
//        days.put(7, "Sabtu");
//
//        // mencetak semua isi dari objek days
//        System.out.println("Isi objek days: " + days);
//        System.out.println("Hari kedua: " + days.get(2));
//
//        // menghapus malam minggu <-- jomblo detected :D
//        days.remove(1);
//        System.out.println("Isi objek days: " + days);
//
//        // menghapus semua hari <-- oh tidak kiamat donk!
//        days.clear();
//        System.out.println("Isi objek days: " + days);
//
//        // mengubah hari menggu menjadi hari ahad
//        days.put(1, "Ahad");
//
//        // mengubah hari rabu menjadi rabo
//        days.replace(4, "Rabo");
//
//        // mencetak semua isi dari objek days
//        System.out.println("Isi objek days: " + days);

        // membuat objek hashmap
        HashMap<String, Buku> books = new HashMap<String, Buku>();

        // membuat objek buku
        Buku bukuJava = new Buku("Tutorial Java", "Petani Kode");
        Buku bukuKotlin = new Buku("Pemrograman Kotlin", "Petani Kode");
        Buku bukuAndroid = new Buku("Pemrograman Android", "Petani Kode");

        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);

        // cetak semua buku
        for(Map.Entry b: books.entrySet()){
            Buku buku = (Buku) b.getValue();
            System.out.println(b.getKey() + ": "+ buku.getTitle());
        }

    }
}
