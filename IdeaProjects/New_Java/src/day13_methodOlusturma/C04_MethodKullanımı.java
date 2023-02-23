package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanımı {
    public static void main(String[] args) {
        //iki sayı al, faktoryel hesapla

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("10 dan küçük 2 poz. tamsayı girin");
        int sayı1= kullanıcı.nextInt();
        int sayı2= kullanıcı.nextInt();
        int sonuc= C03_Faktoryel.faktoryelHesapla(sayı1) + C03_Faktoryel.faktoryelHesapla(sayı2);
        System.out.println(sonuc);
    }
}
