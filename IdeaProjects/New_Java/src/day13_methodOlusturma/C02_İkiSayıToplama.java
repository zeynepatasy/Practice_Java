package day13_methodOlusturma;

import java.util.Scanner;

public class C02_İkiSayıToplama {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı alıp,toplamlarınını yazdıran bir method olusturun
        //void sadece yazdıranlar
        //main methodun dısında olur veya baska methodların.Class içinde olması gerekir
        ikiSayıyıTopla(); //method call ile çagırdık çalıştırmak için
        ikiSayıyıTopla();
    }
    public static void ikiSayıyıTopla(){
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen iki tam sayı giriniz");
        int ilkSayı= kullanıcı.nextInt();
        int ikinciSayı=kullanıcı.nextInt();
        int toplam=ilkSayı+ikinciSayı;
        System.out.println("İki sayının toplamı: "+ toplam);

    }
}
