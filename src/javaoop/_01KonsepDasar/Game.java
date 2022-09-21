package javaoop._01KonsepDasar;

public class Game {
    public static void main(String[] args) {

        // membuat objek player
        Player petani  = new Player();

        // mengisi atribut player. Karena kalau tidak diisi akan bernilai Null dan bisa menyebabkan NullPointerException.
        petani.name = "Petani";
        petani.speed = 78;
        petani.healtPoin = 0;

        // menjalankan method
        petani.run();

        /*
            Hasilnya, pesan Game Over! akan ditampilkan. Karena method isDead() akan mengembalikan nilai true jika
            nilai hp kurang atau sama dengan nol.
         */

        if(petani.isDead()){
            System.out.println("Game Over!");
        }
    }
}
