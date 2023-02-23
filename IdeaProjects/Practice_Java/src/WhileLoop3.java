import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        Scanner kullanıcı = new Scanner(System.in);
        int sayı = 1;
        int toplam = 0;
        int sayıadet = 0;

        while (sayı!= 0) {
            System.out.println("Lütfen bir sayı giriniz" + "\n bitirmek istediğinizde 0 'a basınız");
            sayı = kullanıcı.nextInt();
            sayıadet++;
            toplam+=sayı;

                if (sayı!=0){

                    sayıadet++;
                    toplam+=sayı;

          }
        }
        System.out.println("Sayı adedi: " +sayıadet +"sayıların toplamı: " +toplam);
    }
}
