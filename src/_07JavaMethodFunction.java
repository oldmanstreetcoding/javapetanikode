/*
    - Prosedur adalah sebutan untuk fungsi yang tidak mengembalikan nilai. Fungsi ini biasanya ditandai dengan kata kunci void.
    - Fungsi adalah sebutan untuk fungsi yang mengembalikan nilai.
    - Method adalah fungsi yang berada di dalam Class. Sebutan ini, biasanya digunakan pada OOP.
    - Format
        static TypeDataKembalian namaFungsi(){
            // statemen atau kode fungsi
        }

        static TipeData namaFungsi(TipeData namaParameter, TipeData namaParameterLain){
            // kode fungsi
        }
 */

public class _07JavaMethodFunction {

    // Pemanggilan fungsi dari fungsi lain
//    public static void main(String[] args) {
//        int s = 12;
//        int luas = luasKubus(s);
//
//        System.out.println(luas);
//    }
//
//    // membuat fungsi luasPersegi()
//    static int luasPersegi(int sisi){
//        return sisi * sisi;
//    }
//
//    // membuat fungsi luasKubus()
//    static int luasKubus(int sisi){
//
//        // memanggil fungsi luasPersegi
//        return 6 * luasPersegi(sisi);
//    }

    // Fungsi static dan non static
    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }

    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }

    // fungsi main
    public static void main(String[] args) {

        // pemanggilan fungsi static
        minum("Kopi");


        // mambuat instansiasi objek saya dari class FungsiStatic
        _07JavaMethodFunction saya = new _07JavaMethodFunction();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");

    }
}
