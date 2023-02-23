package day11_stringManipulation;

import java.util.Scanner;

public class C08_soru2çözüm {
    public static void main(String[] args) {
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz");
        String sifre= kullanıcı.nextLine();
        int flag=0;

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            flag++;
        }else {
            System.out.println("ilk harf kucuk harf olmali");
        }
        //if ()

    }
}
