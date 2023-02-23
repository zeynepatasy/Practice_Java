import java.util.Scanner;

public class SayılarınYeriniDeğiştirme {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen birinci tam sayıyı giriniz");
        int sayı1= kullanıcı.nextInt();
        System.out.println("Lütfen ikinci tam sayıyı giriniz");
        int sayı2= kullanıcı.nextInt();

        int temp=0;
        temp=sayı2;
        sayı2=sayı1;
        sayı1=temp;

        System.out.println("Sayi1'in yeni degeri : " + sayı1);
        System.out.println("Sayi2'in yeni degeri : " + sayı2);

    }
}
