import java.util.Scanner;

public class StringManipulation7 {
    /*public static void main(String[] args) {
/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem


		 */

        /*Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime=kullanıcı.nextLine().toLowerCase();

        if (kelime.startsWith("g")){
            System.out.println(kelime.charAt(0)+kelime.substring(2));
        }
        if (kelime.charAt(0)=='h'){
            System.out.println(kelime);
        }
        if (kelime.startsWith("gh")){
            System.out.println(kelime);
        }
        if (!(kelime.startsWith("g") && kelime.startsWith("h") && kelime.startsWith("gh")) ){
            System.out.println(kelime.substring(2));
        }*/
        public static void main(String[] args) {
            Scanner scan  = new Scanner(System.in);
            System.out.print("bir string giriniz :");
            String str = scan.next().toLowerCase();

            if(str.startsWith("gh")){
                System.out.println(str);
            }else if(str.startsWith("g")){
                System.out.println(str.charAt(0) + str.substring(2));
            }else if(str.charAt(1) == 'h'){
                System.out.println(str.substring(1));
            }else
                System.out.println(str.substring(2));


        }
}


