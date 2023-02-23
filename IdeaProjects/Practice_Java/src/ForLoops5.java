import java.util.Scanner;

public class ForLoops5 {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin


        Scanner kullanıcı = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değeri giriniz");
        int başlangıç = kullanıcı.nextInt();
        System.out.println("Lütfen bitiş değeri giriniz");
        int bitiş = kullanıcı.nextInt();
        int toplam = 0;


        if (başlangıç < bitiş) {
            for (int i = başlangıç; i <=bitiş; i++) {
                toplam += i;
            }

        } else {
            for (int i = başlangıç; i >= bitiş; i--) {
                toplam += i;

            }
        }
        System.out.println("toplam: " +toplam);
    }
}
