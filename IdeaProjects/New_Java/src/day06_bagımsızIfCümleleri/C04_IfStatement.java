package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {
        //kullanıcıdan notunu alın 50 veya daha büyükse sınıfı geçtin  50 den küçükse kaldın yazdırın

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= kullanıcı.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("sınıfı geçtin");
        }
        if (not<50){
            System.out.println("sınıfta kaldın");

            // Soru 5- Kullanicidan notunu alin
            //         50 veya daha buyukse ”Sinifi Gectin”,
            //         50’den kucukse “Maalesef kaldin” yazdirin.
        /*
            if statements'da sart parantezinden sonra {} kullanmazsak
            Java ilk ; ' e kadar olan kismi if body olarak kabul eder
            if body zaten bir satir ise bu bir sorun olmaz
            ama if body 1 satirdan coksa, ilk satirdan sonrasi
            her durumda calisir
         */
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen notunuzu giriniz");
            double not1 = scan.nextDouble();
            if(not1 >= 50 && not1<=100) System.out.println("Sinifi gectin");
            System.out.println("Kontrol1");
            System.out.println("Kontrol2");
            System.out.println("Kontrol3");
            if (not1<50) System.out.println("Maalesef kaldin");
        }
    }
}
