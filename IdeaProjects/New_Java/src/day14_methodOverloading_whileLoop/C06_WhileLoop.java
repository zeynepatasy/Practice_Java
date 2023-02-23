package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlarin saglayan sifre oldugunda
        // "5.denemenizde basarili sifre olusturuldu" seklinde aciklama yazin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli
        // - 8 karakter veya daha uzun olmali
        Scanner kullanıcı=new Scanner(System.in);
        String sifre=" ";
        int flag=0;
        int denemeSayisi=0;

        while (flag!=4) {
            flag = 0;

            System.out.println("Lütfen bir sifre giriniz");
            sifre = kullanıcı.nextLine();
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;
            } else {
                System.out.println("Lütfen sifrenin ilk harfini küçük giriniz");
            }
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Lütfen sifrenin son harfini büyük giriniz");
            }
            if (sifre.contains(" ")) {
                System.out.println("Sifre boşluk içermemeli");
            } else {
                flag++;
            }
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Sifre 8 karaktere eşit veya uzun olmalı");

            }
            denemeSayisi++;
        }
        System.out.println("Tebrikler " + denemeSayisi +".denemede şifreniz basarıyla kaydedildi" );
    }
}
