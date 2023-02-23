import java.util.Scanner;

public class IfElseStatements1 {
    public static void main(String[] args) {
         /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        Scanner kullanıcı=new Scanner(System.in);


        System.out.println("Lütfen cinsiyetinizi giriniz");

        String cinsiyet= kullanıcı.nextLine();
        System.out.println("Lütfen yasınızı giriniz");
        double yas= kullanıcı.nextDouble();

        if (yas<0 || yas>90){
            System.out.println("geçersiz yas girdiniz");
        } else if (!(cinsiyet.equalsIgnoreCase("Kadın") || cinsiyet.equalsIgnoreCase("Erkek"))) {
            System.out.println("geçersiz cinsiyet girdiniz");
        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas>=60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas>=65) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet.equalsIgnoreCase("Kadın") && yas<60) {
            System.out.print("emekli olmak için " + (60-yas) + "yıl gerekir");
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas<65) {
            System.out.println("emekli olmak için" + (65-yas)+ "yıl gerekir");
        }
    }
}
