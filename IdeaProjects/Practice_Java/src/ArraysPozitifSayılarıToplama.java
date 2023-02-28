import java.util.Arrays;

public class ArraysPozitifSayılarıToplama {
    /*Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz.

Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun.

Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun.

*/

    public static void main(String[] args) {
       //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
       // sonucu bize donduren bir method yaziniz
        int[]arr={11,-11,23,-23,45};
       arr= new int[]{pozitifSayılarıTopla(arr)};
        System.out.println(Arrays.toString(arr));

    }

    public static int pozitifSayılarıTopla(int[]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }
        }

        return toplam;
    }


}
