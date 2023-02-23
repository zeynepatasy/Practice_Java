import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= kullanıcı.nextDouble();

        if (not>=90 && not<=100) {
            System.out.println("You  made A, Great job");
        } else if (not<90 && not>=80) {
            System.out.println("You made B, Good");
        } else if (not<80 && not>=70) {
            System.out.println("You made C, That's Okay");
        } else if (not<70 && not>=60) {
            System.out.println("You made D, Really?");
        }else {
            System.out.println("You made F, Study more");
        }

    }
}
