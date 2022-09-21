package javaoop._02InheritanceOverriding;

public class Segitiga extends BangunDatar{
    float alas;
    float tinggi;

    float luas(){
        float luas = (float) 0.5 * (alas * tinggi);
        System.out.println("\nLuas Segitiga: " + luas);
        return luas;
    }
}
