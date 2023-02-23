import java.util.Scanner;

public class StringManipulation3 {
    public static void main(String[] args) {
        //Kullanicidan isim ve soyismini ayri ayri alin.
               // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        //yazdirin
               // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        //harflerle yazdirin.

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= kullanıcı.nextLine();
        System.out.println("Lüften soyisminizi giriniz");
        String soyisim= kullanıcı.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println(isim.toUpperCase().charAt(0) + isim.toLowerCase().substring(1));
            System.out.println(soyisim.toUpperCase().charAt(0)+ soyisim.toLowerCase().substring(1));
        }if (soyisim.length()>isim.length()){
            System.out.println(isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1));
            System.out.println(soyisim.toUpperCase());
        }
    }
}
