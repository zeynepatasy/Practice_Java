import java.util.Scanner;

public class StringManipulations4 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz" );
        String isim= kullanıcı.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim= kullanıcı.nextLine();

        String isimSoyisim=isim.concat(" " + soyisim);
        System.out.println(isimSoyisim);

          String ilkHarfsiz=isim.substring(1);
          String ilkHarfsiz2=soyisim.substring(1);
        System.out.println(ilkHarfsiz.concat(ilkHarfsiz2));






    }
}
