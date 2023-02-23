import java.util.Scanner;

public class SayınınRakamlarToplamı {
    public static void main(String[] args) {
       //kullanıcıdan 3 basamaklı bir sayı alın
        // sayının rakamlar toplamını yazdırın

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir tamsayı giriniz");
        int girilenSayı= kullanıcı.nextInt();

        int rakam=girilenSayı%10;
        int rakamlarToplamı=rakam;

        girilenSayı=girilenSayı/10;
        rakam=girilenSayı%10;
        rakamlarToplamı=rakamlarToplamı+rakam;

        girilenSayı=girilenSayı/10;
        rakam=girilenSayı%10;
        rakamlarToplamı=rakamlarToplamı+rakam;
        System.out.println(rakamlarToplamı);
    }
}
