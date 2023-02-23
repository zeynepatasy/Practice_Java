import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {
       //while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int sayı = scan.nextInt();  //2562

        int rakamlartoplamı=0;

    while (sayı!=0){

        rakamlartoplamı+=sayı%10;
        sayı/=10;

    }
        System.out.println(rakamlartoplamı);
    }
}
