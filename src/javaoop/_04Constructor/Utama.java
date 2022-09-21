/*
    Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance).
    Biasanya method ini digunakan untuk inisialisasi atau mempersiapkan data untuk objek.

    Cara membuat constructor adalah dengan menuliskan nama method constructor sama seperti nama class.

    Pastikan memberikan modifier public kepada Constructor, karena ia akan dieksekusi saat pembuatan objek (instance).
 */
package javaoop._04Constructor;

class User {
    public String username;
    public String password;

    // Constructor tanpa variable, akan default di create java jika kita tidak buat constructor;
    public User() {
        System.out.println("Eksekusi method constructor...");
    }

    // Contructor dengan variable. Boleh ada 2 atau lebih contructor (overloading), karena java akan check ksesuaian arguments.
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}

public class Utama {
    public static void main(String[] args) {
        User petani = new User();

        User petanikode = new User("petanikode", "kopi");
        System.out.println("Username: " + petanikode.username);
        System.out.println("Password: " + petanikode.password);
    }
}
