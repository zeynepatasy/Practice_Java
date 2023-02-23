package day11_stringManipulation;

import java.util.Scanner;

public class C07_soru {
    //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
    //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
    //basariyla kaydedildi" yazdirin
    // - ilk harf kucuk harf olmali
    //son karakter rakam olmali
    //sifre bosluk icermemeli
    //uzunlugu en az 10 karakter olmali
    public static void main(String[] args) {
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre= kullanıcı.nextLine();
        int flag=0;

        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }
        if (flag==0){
            System.out.println("doğru sifre girdiniz");
        }
    }

}
