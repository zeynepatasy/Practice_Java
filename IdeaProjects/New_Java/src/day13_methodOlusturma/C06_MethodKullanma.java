package day13_methodOlusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        //Verilen bir stringin palindrome olup olmadıgını yazdırın

        //düzden ve tersten aynı sekilde yazılan(palindrome)

        //madam,123321
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin= kullanıcı.nextLine();

        String tersMetin=C05_StringiTerseÇevirme.stringiTersineÇevir(metin);
        if (metin.equals(tersMetin)){
            System.out.println("Girilen metin palindrome");
        }else {
            System.out.println("Girilen metin palindrome değil");
        }


       // System.out.println(C05_StringiTerseÇevirme.stringiTersineÇevir("MADAM"));

    }

}