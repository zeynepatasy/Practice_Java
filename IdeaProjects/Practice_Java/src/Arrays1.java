import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String dizi[] = new String[4];
        dizi = new String[]{"Selamlar ", "Kod ", "Kampüsüne ", "Hoş ", "Geldiniz "};
        //Dizimizin içerisindeki kelimeleri Array in elemanları olarak yazdırın

       for (int i = 0; i < dizi.length ; i++) { //Selamlar Kod Kampüsüne Hoş Geldiniz
            System.out.print(dizi[i]);

        }
        /*for (int i = 1; i <5 ; i++) { //Kod Kampüsüne Hoş Geldiniz
            System.out.print(dizi[i]);
        }*/
        System.out.println(" ");
        for (int i = 0; i < 5 ; i++) {
            System.out.print(dizi[i].substring(0,2));//SeKoKaHoGe
            System.out.println(dizi[i]);//Selamlar Kod Kampüsüne Hoş Geldiniz
        }
        System.out.println(" ");
        System.out.print(dizi[0].substring(0,5)); //Selam
    }

}
