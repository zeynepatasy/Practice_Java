package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı isteyim 5 ile bölünüyorsa sayı 5'in katı yazdırın
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lüften pozitif bir tamsayı giriniz");

        int sayı= kullanıcı.nextInt();
        if (sayı%5==0){
            System.out.println("Sayı 5'in tam katı");
        }
        if (sayı%3==0){
            System.out.println("Sayı 3'ün tam katı"); //15 ikisinin de katı olduğundan ikisini de yazdırdı.
        }

    }
}
