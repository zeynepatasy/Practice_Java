package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerİlkGörev {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın ve sayının karesini yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
       double girilenSayı= scan.nextDouble(); //önce kullanıcıdan aldığımız sayıyı atama yapmamız gerekir.
        System.out.println("girilen sayının karesi:" + girilenSayı*girilenSayı);

    }
}
