import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTamBölenleriBulma {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan main method'da pozitif bir tamsayi alip,
        //         o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.


        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilensayı= kullanıcı.nextInt();
        System.out.println(pozitifBölenlerListMethodu(girilensayı));

    }
    public static List<Integer>pozitifBölenlerListMethodu(int sayı){
        List<Integer>pozitifBölenlerList=new ArrayList<>();
        for (int i = 1; i <=sayı ; i++) {
            if (sayı % i==0){
                pozitifBölenlerList.add(i);
            }

        }
        return pozitifBölenlerList;
    }
}
