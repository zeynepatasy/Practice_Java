import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
       // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayı= kullanıcı.nextInt();

        int rakam=sayı%10;
        int rakamlarToplamı=rakam;

        sayı=sayı/10;//123
        rakam=sayı%10;//4
        rakamlarToplamı=rakamlarToplamı+rakam;

        sayı=sayı/10;//12
        rakam=sayı%10;//3
        rakamlarToplamı=rakamlarToplamı+rakam;

        sayı=sayı/10;//1
        rakam=sayı%10;//2
        rakamlarToplamı=rakamlarToplamı+rakam;

        sayı=sayı/10;//1
        rakam=sayı%10;//1
        rakamlarToplamı=rakamlarToplamı+rakam;
        System.out.println("rakamlar toplamı: " + rakamlarToplamı);

    }
}
