package day10_stringManipulation;

import java.util.Scanner;

public class C04_endWith {
    public static void main(String[] args) {
        //​SORU : kullanicidan bir mail alin-
        // mail @ icermiyorsa "gecersiz mail"
        // - mail @gmail.com icermiyorsa, "mail gmail olmali"
        // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"yazdirin.

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir mail adresi giriniz");
        String mail= kullanıcı.nextLine();
        
        if (! mail.contains ("@")){
            System.out.println("gecersiz mail");

        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");

        } else if ( ! mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
        //bunu bağımsız if cümleleriyle de yaparız eğer 3 hatayı da kontrrol etmesini istiyorsak

    }
}
