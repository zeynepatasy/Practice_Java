package day02_dataTurleri_Scanner;

public class C02_NonPrimitiveDataTürleri {
    public static void main(String[] args) {
         String isim=" Ali Can";
         String ilkHarf="K";
         char ilkHarf2='m';
          //tek bir karakter için ikisini de kullanabiliriz.
        System.out.println(ilkHarf.toLowerCase()); //k
        System.out.println(ilkHarf2);
        // primitive data türündeki variable'lar sadece DEĞER taşır.
        //non primitive data türündeki variable'ların hem DEĞER hem METHODLARI olur.

        String not="not";
        String Not="Variable isimlerinin büyük harfle baslaması tavsiye edilmez ama java kabul eder.";
        String nOT=" bir kere deklare edilen variable tekrar deklare edilemez";
        String nOt="İsimler faklı sekilde yazıldığı için java bunları farklı variable kabul eder.";

    }
}
