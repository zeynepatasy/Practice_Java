import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String girilenMetin= kullanıcı.nextLine();
        System.out.println("girilen metin:" +girilenMetin);
        System.out.println("lütfen bir kelime giriniz");
        String girilenKelime= kullanıcı.nextLine();
        System.out.println("girilen kelime:" + girilenKelime);
        System.out.println("lütfen bir tam sayı giriniz");
        int tamSayı= kullanıcı.nextInt();
        System.out.println("girilen tam sayı:" + tamSayı);
        System.out.println("lütfen bir ondalikli sayı giriniz");
        double ondalıklıSayı= kullanıcı.nextDouble();
        System.out.println("girilen ondalıklı sayı:" + ondalıklıSayı);
    }
}
