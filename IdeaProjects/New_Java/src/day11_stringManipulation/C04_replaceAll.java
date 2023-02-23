package day11_stringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        // str'daki sayilari method'la temizleyin
        /*
            Eger degistirmek istedigimiz metin tek bir metin degil,
            ortak ozelligi olan farkli metinlerse
            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space'ler
            - space olmayan tum karakterler
            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir
         */
        String str = "J1a23va34 5C54and65ir87";

        str = str.replaceAll("\\d","");
        System.out.println("str'in yeni hali : " + str);
    }
}
