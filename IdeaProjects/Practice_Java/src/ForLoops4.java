import java.util.Scanner;

public class ForLoops4 {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen baslangıc değeri giriniz");
        int ilkDeğer= kullanıcı.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz");
        int sonDeğer=kullanıcı.nextInt();

        int toplam=0;

        if (ilkDeğer>sonDeğer){
            System.out.println("Başlangıç değeri, bitiş değerinden büyük");
        }else {
            for (int i = ilkDeğer; i <=sonDeğer ; i++) {

                toplam+=i;

        }

        }

        System.out.println("sayıların toplamı: " + toplam);
    }
}
