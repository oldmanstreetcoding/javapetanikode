/*
    Method setter dan getter adalah dua method yang tugasnya untuk mengambil dan mengisi data ke dalam objek.
    Dalam OOP kita sering mendengar istilah encapsulation (pembungkusan), di mana data dibungkus dengan modifier
    private agar tidak bisa diakses secara langsung dari luar class.

    Nah method setter dan getter inilah yang akan membantu kita mengakses data tersebut.

    Ada beberapa alasannya:
    1. Untuk meningkatkan keamanan data;
    2. Agar lebih mudah dalam mengontrol atribut dan dan method;
    3. Class bisa kita buat menjadi read-only dan write-only;
    4. dan fleksibel: programmer dapat mengganti sebagian dari kode tanpa harus takut berdampak pada kode yang lain.

    Method setter dan getter harus diberikan modifier public, karena method ini akan diakses dari luar class.
    Perbedaan method setter dengan getter terletak pada nilai kembalian, parameter, dan isi method-nya.
    Method setter tidak memiliki nilai kembalian void (kosong). Karena tugasnya hanya untuk mengisi data ke dalam atribut.
    Sedangkan method getter memiliki nilai kembalian sesuai dengan tipe data yang akan diambil.

    Nama method setter dan getter harus diawali dengan set untuk setter dan get untuk getter.

 */
package javaoop._05SetterGetter;

class Anggota {

    // deklarasi variable private
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

}

public class User{

    public static void main(String[] args) {

        // membuat objek dari class anggota
        Anggota dian = new Anggota();

        // menggunakan method setter
        dian.setUsername("dian");
        dian.setPassword("kopijava");

        // menggunakan method getter
        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
    }
}
