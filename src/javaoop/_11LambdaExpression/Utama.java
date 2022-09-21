/*
    Fungsi anonymous adalah fungsi yang tidak memiliki nama. Fungsi anonymous di Java dikenal juga
    dengan lambda expression. Fungsi anonymous biasanya dibuat hanya untuk sekali pakai.
    Artinya, saat kita membuat fungsi anonymous, kita akan mengeksekusinya saat itu juga. Tidak bisa dipanggil lagi
    seperti fungsi biasa.

    (int param1, int param2) -> {

    }

    1. () tempat kita menaruh parameter.
    2. -> (operator lambda) simbol yang menandakan fungsi ini adalah lambda/anonymous.
    3. {} body fungsinya.

    // ini fungsi biasa
    int jumlahkan(int a, int b){
        return a + b;
    }

    // ini fungsi anonymous
    (int a, int b) -> { return a + b }
    (int a, int b) -> return a + b;

    Fungsi ini dapat dibuat di beberapa tempat:
    1. Pada Deklarasi variabel
        int variabel = () -> { return 0 };

    2. Pada pengisian variabel dan array
        int variabel;
        int arr;
        variabel = () -> { return 0 };
        arr = () -> { return {0,4,3,2,1} };

    3. Pada saat mengembalikan nilai dengan return
        int methodName(){
            return () -> { return 0 };
        }

    4. Pada body lambda itu sendiri
       () -> {
            return () -> 5 + 2;
        };

    5. Pada ekspresi kondisional (?:)
        String jawab = (int x) -> { x < 10} ? () -> return "yes": () -> return "no";
 */
package javaoop._11LambdaExpression;

public class Utama {

    public static void main(String[] args) {
        Button btn = new Button();
        String name = "Petani Kode";

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(() -> {
            System.out.println("Tombol sudah diklik!");
            System.out.println("Yay!");
            System.out.println("Hello " + name);
        });

        // mencoba klik tombol
        btn.doClick();
    }
}
