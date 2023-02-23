package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner kullanıcı=new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char karakter=kullanıcı.next().charAt(0);

        if (karakter>=65 && karakter<=90){  //   //'A'<=karakter && 'Z'>=karakter //ascii tablosundaki karakterler mat.işlemleriyle işleme girdiğinde sayıya dönüşür
            System.out.println("büyük harf girildi");
        }else {
            System.out.println("büyük harf girmediniz");
        }
    }
}
