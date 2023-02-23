import java.util.Scanner;

public class StringManipulation6 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=kullanıcı.nextLine();

        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2));
        }else {
            System.out.println(kelime.charAt(0));
            System.out.println(kelime.substring(0,1));
            System.out.println(kelime);
        }
    }
}
