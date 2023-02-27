import java.util.Arrays;
import java.util.Scanner;

public class ArraysKullanıcıdanDeğerALıpEkleme {
    public static void main(String[] args) {
        // Kullanicidan array olusturmak uzere pozitif tamsayilar alin
        // kullaniciya islemi bitirmesi icin 0'a basmasi gerektigini soyleyin
        // bir onceki class'dan method kullanarak aldiginiz elementleri arr'e ekleyin


        Scanner kullanıcı=new Scanner(System.in);
        int girilenSayi=1;
        int[] arr= new int[0];//[]

        while (girilenSayi!=0){
            System.out.println("lütfen pozitif tamsayılar giriniz"+
                    "\nBitirmek için 0'basınız");
            girilenSayi= kullanıcı.nextInt();
            if (girilenSayi!=0){

                arr=ArraysMethodİleElemanEkleme.intElemanEkleme(arr,girilenSayi);

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
