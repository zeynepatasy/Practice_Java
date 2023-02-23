package day04_dataCasting_wrapperClass;

public class C01_AsciiTable {
    public static void main(String[] args) {

        //cahr data türündeki variable  ve değerler
       // sayısal data türlerine atanırsa veya
       // sayısal data türündeki datalarla işleme sokulursa
       // ascii table daki değerleri ile işleme girer.
        System.out.println( 5 + 'a'); //102

        char ilkHarf=101;
        System.out.println(ilkHarf); //e

        char girilenHarf='f';
        System.out.println(girilenHarf+1); //102+1=103
         //f den sonraki harfi yazdırmak istersek
        System.out.println("girilen harften sonraki harf:" + (char)(girilenHarf+1));

        //verilen bir harften iki önceki harfi yazdırın

        char girilenChar='m';
        System.out.println(girilenChar-2); //107
        System.out.println("verilen bir harften iki önceki harf:" + (char)(girilenChar-2)); //k
 //kullanıcıdan bir harf alın ve alfabede o harften sonraki 3 harfi yazdırın



    }
}
