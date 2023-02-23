import java.util.Scanner;

public class StringManipulation2 {

    public static void main(String[] args) {
        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        //son karakter rakam olmali
        //sifre bosluk icermemeli
        //uzunlugu en az 10 karakter olmali

        Scanner kullanıcı = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre = kullanıcı.nextLine();
        int flag=0;

        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kücük harf olmalı");
           flag++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            flag++;


        }if (sifre.contains(" ")) {
            System.out.println("sifre bosluk içermemeli");
            flag++;



        }  if (!((sifre.length()) >= 10)) {
            System.out.println("sifre 10 dan fazla karakter içermeli");
            flag++;

        }  if (flag==0){
            System.out.println("sifreyi doğru girdiniz");


        }
    }
}
