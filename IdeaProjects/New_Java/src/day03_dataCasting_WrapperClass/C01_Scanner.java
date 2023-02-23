package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //ln yazdırma işlemini yaptıktan sonra alt satıra geçmesini sağlar.
        // prinln yerine print yazarsak ya<dıklarımızı bir satırda görürüz.

        //nextchar olmadığı için nextline seçtik ve de 0 almak istediğimiz charın indexidir.ve javada index 0 dan baslar.
        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //      Isminiz : John
        //      Soyisminiz : Doe
        //      Yasiniz : 44
        //      Kaydiniz basariyla tamamlanmistir.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi yaziniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();
        /*
        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir");
         */
        // Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // Ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        // SIMDILIK kullanici biz ne diyorsak onu tam yapiyor kabul edelim
        /*
        System.out.print("Isminiz : " + isim);
        System.out.print("Soyisminiz : " + soyisim);
        System.out.print("Yasiniz : " + yas);
        System.out.print("Kaydiniz basariyla tamamlanmistir");
        System.out.println()'deki ln
        yazdirma islemini yaptiktan sonra
        alt satira gecmesini saglar
        println yerine print yazarsak
        yazdirdigimiz seyler yanyana yazdirilir
         */
        System.out.println("Isminiz : " + isim+
                "\nSoyisminiz : " + soyisim+
                "\nYasiniz : " + yas+
                "\nKaydiniz basariyla tamamlanmistir");
        /*
            Tek bir System.out.println() ile birden fazla satir yazdirmak isterseniz
            String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */
    }
}
