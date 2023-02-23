import java.util.Scanner;

public class ForLoops8 {
    public static void main(String[] args) {
         /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14

	     */
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("lütfen 1 den büyük bir tamsayı giriniz");
        int sayı= kullanıcı.nextInt();
        int toplam=0;

       /* for (int i = 1; i <sayı; i++) {
            for (int j = 1; j <sayı ; j++) {
                System.out.print(i*j+"");
            }
            System.out.println();
        }*/

        for (int i = 1; i <sayı ; i++) {
            toplam+=i*i;
        }
        System.out.println("girilen sayı:" + sayı);
        System.out.println("toplam: " + toplam);
        }

    }

