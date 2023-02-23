import java.util.Scanner;

public class DataCasting2 {
    public static void main(String[] args) {
        /*Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
                yazin
        Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
        Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        ile 127 arasindaki bir sayiya donusturup yazdirin.
                Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        isleminin sonucununun tamsayi kismini yazdirin.
                Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        ve bolum isleminin sonucununun tamsayi kismini yazdirin.*/


        /*Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazın
         int sayı1=3;
         int sayı2=4;
         int sayı3=5;

         int toplam=sayı1+sayı2+sayı3;
         double ortalama=toplam/3.0;
        System.out.println("3 sayının ortalaması: " + ortalama);*/

       // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

       /* Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf=kullanıcı.next().charAt(0);
           System.out.println("girilen harf:" + (char)(harf)+","+(char)(harf+1)+","+ (char)(harf+2)+","+(char)(harf+3));*/

        /*Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
       // ile 127 arasindaki bir sayiya donusturup yazdirin.

       Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayı= kullanıcı.nextInt();
        System.out.println(((byte)sayı));*/

       // Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.
        /*Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lüften birinci ondalıklı  sayıyı giriniz");
        double sayı1= kullanıcı.nextDouble();
        System.out.println("Lüften ikinci ondalıklı  sayıyı giriniz");
        double sayı2= kullanıcı.nextDouble();

       double bölüm=sayı1/sayı2;

        System.out.println("bölüm: "+(int)(bölüm) );*/

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
       // ve bolum isleminin sonucununun tamsayi kismini yazdirin

       /* Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lüften ondalıklı bir sayı giriniz");
        double sayı1= kullanıcı.nextDouble();
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı2= kullanıcı.nextInt();
        System.out.println("bölüm: "+(int) sayı1/sayı2);*/


    }
}
