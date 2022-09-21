/*
    Class Anonymous adalah class yang tidak memiliki nama. Biasanya dibuat hanya untuk sekali pakai saja.
    Pada dasarnya class anonymous sama seperti class biasa.

    Biasanya class anonymous dibuat untuk mengimplementasikan interface dan class abstrak secara langsung.

    Anonymous class biasanya kita butuhkan saat tidak ingin membuat implementasi dari interface dan class abstrak
    dalam file Java yang berbeda. Kita ingin.. implementasinya langsung di dalam kode yang sedang ditulis.

    Class anonymous dapat kita buat di beberapa tempat:
    1. Fields (pada properti)
        class Sesuatu {
          String nama;
          int umur;
          Anonymous anonField = new Anonymous(){
            // impllementasi di sini
          }
        }

    2. Di dalam method (parameter dan body)
        class Sesuatu {
          String nama;
          int umur;
          void sayHello(new Anonymous(){
              // kode implementasi di sini
          });
          void sayThanks(){
            new Anonymous(){
              // kode implementasi di sini
            }
          }
        }

    3. Instance initializers
       class Sesuatu {
          private Anonymous anonobj;
          void Susuatu(){
            this.anonobj = new Anonymous(){
              // kode implementasi di sini
            }
          }
        }

    4. Local classes (di dalam inner class)
        class Sesuatu {
          class Lokal {
            void doSomething(){
              new Anonymous(){
                // kode implementasi di sini
              }
            }
          }
        }
 */
package javaoop._10AnonClass;

public class Utama {

    // membuat variabel di dalam class
    static String title = "Tutorial Anonymous Class";

    public static void main(String[] args) {

        // membuat variabel di dalam method main
        String name = "Petani Kode";

        Button btn = new Button();

        // buat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            // membuat variabel di dalam class anonymous
            String message = "belajar Anonymous Class di Java";

            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik!");
                System.out.println("Yay!");
                // mengakses variabel
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }

        });

        // coba klik tombol
        btn.doClick();
    }
}
