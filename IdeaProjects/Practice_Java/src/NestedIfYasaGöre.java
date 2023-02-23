import java.util.Scanner;

public class NestedIfYasaGöre {
    public static void main(String[] args) {
          /*Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.*/

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("lüften cinsiyetinizi giriniz");
        String cinsiyet= kullanıcı.nextLine();
        System.out.println("Lütfen yasınızı giriniz");
        int yas= kullanıcı.nextInt();
        
        if (yas<0 || yas>90){
            System.out.println("geçersiz yas girdiniz");
        } else if (yas<60) {
            if (cinsiyet.equalsIgnoreCase("Kadın") ){
                System.out.println("emekli olmak için " + (60-yas) + "yıl çalışmak gerekir");
            } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                System.out.println("emekli olmak için " + (65-yas) + "yıl çalışmak gerekir");

            }else {
                System.out.println("cinsiyet girişi geçersiz");
            }

        } else if (yas<65) {
                  if (cinsiyet.equalsIgnoreCase("Kadın")){
                      System.out.println("emekli olabilirsiniz");
                  } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
                      System.out.println("emekli olmak için " +(65-yas) +"yıl çalışmak gerekir");

                  }else {
                      System.out.println("yalnış cinsiyet girdiniz");
                  }
        }else {
           if (cinsiyet.equalsIgnoreCase("Kadın")){
               System.out.println("Emekli olabilrsin");
           } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
               System.out.println("emekli olabilirsin");
           }else {
               System.out.println("yanlış cinsiyet girdiniz");
           }

        }
    }
}
