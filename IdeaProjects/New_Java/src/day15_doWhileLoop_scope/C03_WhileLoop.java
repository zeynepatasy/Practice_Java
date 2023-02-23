package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
          /*
               While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
               while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
               bu da bazan hatalara sebep olur
         */
        Scanner kullanıcı=new Scanner(System.in);
        int girilenSayı=1;
        int toplam=0;
        int sayıAdedi=0;

        while (girilenSayı!=0){ //0 olunca sayı while loop devreye girmeyecek direkt bitirecek
            System.out.println("Toplam üzere tam sayı giriniz"+
                    "\nBitirmek için 0'a basınız ");
            girilenSayı= kullanıcı.nextInt();

            if (girilenSayı!=0){
             toplam+=girilenSayı;
                sayıAdedi++;
            }
        }
        System.out.println("Girilen sayı adedi " +sayıAdedi+  "adet sayının toplamı : " + toplam);

    }
}
