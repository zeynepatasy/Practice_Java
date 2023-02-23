package day15_doWhileLoop_scope;

import java.util.Scanner;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;
        int sayiAdedi=0;
        do {
            System.out.println("Toplanmak uzere tamsayi giriniz" +
                    "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }while(girilenSayi !=0);
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);
    }
}
