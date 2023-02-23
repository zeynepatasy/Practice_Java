package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        //Kullanıcıdan alınan sayının rakamlar toplamını bulun

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int girilensayı= kullanıcı.nextInt();
        int rakamlarToplamı=0;
        int birlerBasamağı=0;

        while (girilensayı>0){
           // rakamlarToplamı+=sayı%10; //bu bize basamağı veriyor //sayı /10 da bizi o basamaktan kurtarıyor.
            birlerBasamağı=girilensayı%10;
            rakamlarToplamı+=birlerBasamağı;
            girilensayı/=10; //sayıyı küçültmek için 123 ise 12 olması için

        }
        System.out.println(rakamlarToplamı);
        System.out.println(C02_RakamlarToplamınıBulMethodu.rakamlarToplamı(girilensayı));
    }
}
