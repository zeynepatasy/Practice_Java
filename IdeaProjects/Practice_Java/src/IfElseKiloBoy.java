import java.util.Scanner;

public class IfElseKiloBoy {
    public static void main(String[] args) {
        /*Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdirin.*/
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo= kullanıcı.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy=kullanıcı.nextDouble();

        double vke=kilo/(boy*boy);
        System.out.println(vke);

        if (vke>30){
            System.out.println("obezsiniz");
        } else if (vke>=25 && vke<=30) {
            System.out.println("kilolu");
        } else if (vke>=20 && vke<=25) {
            System.out.println("kilonuz normal");
        } else if (vke<20 ) {
            System.out.println("zayıf");
        }else {
            System.out.println("yanlış giriş yaptınız");
        }
    }
}
