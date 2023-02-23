import java.util.Scanner;

public class StringManipulation11 {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.


        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz");
        String str= kullanıcı.nextLine();
        int boşluk=str.indexOf(' ');

        if (boşluk== -1 && !(str.isEmpty()) ){
            System.out.println("Str boşluk içermiyor");

        }else {
            System.out.println("Boşluk içeriyor");
        }
    }
}
