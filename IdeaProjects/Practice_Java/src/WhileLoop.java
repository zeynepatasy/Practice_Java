import java.util.Scanner;

public class WhileLoop {
    //Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari   yazdirin


    public static void main(String[] args) {

       int sayı=10;

        while (sayı<100){

            if (sayı%7==0){

                sayı++;


            }

        }
        System.out.println(sayı);

    }
}
