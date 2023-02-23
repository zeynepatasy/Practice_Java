package day05_incrementDecrement_concatenation;

public class C04_StringIntGeçişler {
    public static void main(String[] args) {
        String s1="423";
        //s1 i int'a çevirmek istersek

        int sayı=Integer.parseInt(s1);
        System.out.println(sayı++);
        System.out.println(sayı);

        int a=20;
        int b=40;
        //bu 2 sayıyı kullanarak 2040 yazdırın
        System.out.println("" +a+b);
        System.out.println(a+""+b);
        //string, strongdur. Neyle işleme girse stringleştirir.
    }
}
