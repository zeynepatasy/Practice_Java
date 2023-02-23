import java.util.Scanner;

public class ForLoops7 {
    public static void main(String[] args) {
          /*Kullanıcıdan bir harf girmesini isteyiniz.
          Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın.
      Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin.
     (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

      */
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=kullanıcı.nextLine();
        String sesliHarf="a,e,i,o,u";

        for (int i = 0; i < sesliHarf.length(); i++){
            if (sesliHarf.contains(kelime.substring(0,1))){
                System.out.println("girilen  sesli harf");
                break;

            }else {
                System.out.println("girilen harf sesli değil");
                break;

            }
        }


        }
    }

