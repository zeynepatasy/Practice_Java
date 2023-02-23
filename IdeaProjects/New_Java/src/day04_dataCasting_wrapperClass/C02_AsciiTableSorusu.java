package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C02_AsciiTableSorusu {
    public static void main(String[] args) {
        //kullanıcıdan bir harf alın ve alfabede o harften sonraki 3 harfi yazdırın

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");

        char girilenHarf=kullanıcı.next().charAt(0);

        System.out.println( "girilen harf :" + girilenHarf);
        /*System.out.println("girilen harften bir sonraki harf :" +(char) (girilenHarf+1)+ "," +
                "\ngirilen harften iki sonraki harf :" +(char) (girilenHarf+2) + ","+
                "\ngirilen harften üç sonraki harf :" + (char)(girilenHarf+3));*/
        System.out.println((char) (girilenHarf-1));
    }
}
