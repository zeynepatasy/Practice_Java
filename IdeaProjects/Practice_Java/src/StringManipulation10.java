import java.util.Scanner;

public class StringManipulation10 {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= kullanıcı.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=kullanıcı.nextLine();

        if (isim.length()>soyisim.length()){
            System.out.println("isminiz daha uzun");
        } else if (soyisim.length()>isim.length()) {
            System.out.println("Soyisminiz daha uzun");

        }else {
            System.out.println("İsim, soyisim eşit");
        }
    }
}
