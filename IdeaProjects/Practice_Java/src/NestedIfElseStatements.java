import java.util.Scanner;

public class NestedIfElseStatements {
    public static void main(String[] args) {
       /* Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
                Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.
        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.*/


        /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        String cinsiyet= kullanıcı.nextLine();
        System.out.println("Lütfen yasınızı giriniz");
        double yas= kullanıcı.nextDouble();

        if (cinsiyet.equalsIgnoreCase("Kadın")){
            if (yas<0 || yas>90){
                System.out.println("geçersiz yaş girdiniz");
            } else if (yas<60) {
                System.out.println("emekli olmak için " + (60-yas)  + "yıl gerekiryor");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
             if (yas<0 || yas>90){
                 System.out.println("geçersiz yaş girdiniz");
               } else if (yas<65) {
                 System.out.println("emekli olmak için " + (65-yas) + "yıl gerekiyor");
             }else {
                 System.out.println("emekli olabilirsin");
             }
        }else {
            System.out.println("geçersiz cinsiyet girdiniz");
        }
    }

    }

