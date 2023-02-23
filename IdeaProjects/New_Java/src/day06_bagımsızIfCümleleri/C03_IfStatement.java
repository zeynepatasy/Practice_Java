package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        //üçgen eskenar üçgen ise  "Eşkenar Üçgen " yazdırın

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Üçgenin 3 kenar uzunluğunu giriniz");
        double kenar1= kullanıcı.nextDouble();
        double kenar2=kullanıcı.nextDouble();
        double kenar3=kullanıcı.nextDouble();
        //Javada 3'lü karşılastırma yoktur. Onun yerine ikili karşılastırmalar yapıp && ile birlestirebiliriz
        //kenar1==kenar2==kenar3 olmaz0
        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar üçgen olusturur");
        }
    }
}
