package day03_dataCasting_WrapperClass;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz");
        double yarıçap= scan.nextDouble();

        System.out.println("çemberin çevresi : " + 2*3.14 * yarıçap);
        System.out.println("dairenin alanı: " + 3.14*yarıçap*yarıçap);
    }
}
