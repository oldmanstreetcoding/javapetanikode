/*
    #This
    Kata kunci this digunakan sebagai referensi dari class itu sendiri.

    #Super
    Jika this merepresentasikan objek dari class itu sendiri, maka super akan merepresentasikan objek dari class induk.
    Kata kunci super() juga dapat digunakan untuk memanggil method ternetu dari kelas induk.

 */
package javaoop._06ThisandSuper;

class Person {
    private String name;
    int age = 22;

    public Person() {
        System.out.println("Eksekusi konstruktor Person");
    }

    public void showMessage(){
        System.out.println("Hello, ini pesan dari class Person...");
    }

    public void setName(String name){
        /*
            Maka this yang dimaksud pada class tersebut adalah class Person.
            Apakah kita bisa menggunakan this di luar class? Tidak.
            this hanya bisa digunakan di dalam class saja.
         */
        this.name = name;
    }


}

class Employee extends Person {

    float salary = 4000f;
    int age = 23;

    public Employee(){
        // ambil constructor induk
        super();

        System.out.println("EKsekusi konstruktor employee");
    }

    public void showInfo(){
        // age di sini mengambil age pada person (induknya) karena pake super
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }

    public void info(){
        super.showMessage();
    }
}

public class Utama {

    /*
        Perhatikan class Employee, pada konstruktornya kita mengeksekusi konstruktor induk dengan super().
        Lalu, pada method info(), ktai mengeksekusi method showMessage() dari induk dengan super.showMessage().
     */

    public static void main(String[] args) {
        Employee dian = new Employee();

        // contoh penggunaaan super untuk variable
        dian.showInfo();

        // contoh penggunaan super untuk method
        dian.info();
    }

}

