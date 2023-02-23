import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lüften Y/N ikilisinden birini giriniz");

        char karakter=kullanıcı.next().charAt(0);

        if (karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        } else if (karakter=='N' || karakter=='y') {
            System.out.println("NO");
        }else {
            System.out.println("yanlış cevap");
        }

    }


}
