package day11_stringManipulation;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {
        String str="Java candır";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank()); //space lerden mi olusuyor.
        str="   ";

        System.out.println(str.isBlank()); //true
        System.out.println(str.isEmpty());//false space de bir karakter
        System.out.println(str.length()); //

        str="";
        System.out.println(str.isEmpty()); //true
        System.out.println(str.length());//0
        System.out.println(str.isEmpty());// hiçliği de boşluk olarak kabul etti true verdi
    }
}
