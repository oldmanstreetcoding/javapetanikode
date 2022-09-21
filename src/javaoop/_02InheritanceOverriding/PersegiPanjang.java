package javaoop._02InheritanceOverriding;

public class PersegiPanjang extends BangunDatar{

    float panjang;
    float lebar;

    float luas(){
        float luas = panjang * lebar;
        System.out.println("\nLuas Persegi Panjang: " + luas);
        return  luas;
    }

    float keliling(){
        float keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}
