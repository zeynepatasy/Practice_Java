package day06_bagımsızIfCümleleri;

import java.util.Scanner;

public class C08_IfElseStatments {
    public static void main(String[] args) {
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lüften bir karakter giriniz");
        char krk=kullanıcı.next().charAt(0);

        if ('a'<=krk && 'z'<=krk){
            System.out.println(Character.toUpperCase(krk)); //method olduğu için bu wrapper classtan aldık
        }
        else {
            System.out.println(krk);
        }
    }
}
