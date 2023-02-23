package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");

        double yas= kullanıcı.nextDouble();

        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }
        else{
            System.out.println("emekli olabilmek için daha " +(65-yas)+ "yıl çalısmalısın");
        }
    }
}
