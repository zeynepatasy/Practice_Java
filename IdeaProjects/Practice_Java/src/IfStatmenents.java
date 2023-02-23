import java.util.Scanner;

public class IfStatmenents {
    public static void main(String[] args) {
        //kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        //üçgen eskenar üçgen ise  "Eşkenar Üçgen " yazdırın


       Scanner kullanıcı=new Scanner(System.in);
        //System.out.println("Üçgenin 3 kenarının uzunluğunu girin");

       /* int kenar1= kullanıcı.nextInt();
        int kenar2=kullanıcı.nextInt();
        int kenar3=kullanıcı.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("bütün kenarlar eşit, eşkenar üçgen");
        }*/

        //kullanıcıdan notunu alın 50 veya daha büyükse sınıfı geçtin  50 den küçükse kaldın yazdırın

        System.out.println("Lütfen notunuzu giriniz");
         double not= kullanıcı.nextDouble();
         if (not>=50 && not<100){
             System.out.println("sınıfı geçtin");
         }
         if (not<50 && not>0){
             System.out.println("sınıfta kaldın");
         }
    }
}
