package day09_switch_stringManipulation;

import java.util.Locale;

public class C03_toLowercase_toUppercase {
    public static void main(String[] args) {
        String str="Java Candır";
        System.out.println(str.toUpperCase());
        System.out.println(str);

        //String manipulation yaptıktan sonra, asıl variable'a atama yapılmazsa
        //asiıl variabel değiişmez

        str=str.toUpperCase(); //JAVA CANDIR
        //atama yaptıktan sonra değişir
        System.out.println(str);
        System.out.println(str.toLowerCase());

        //str'i türkçe karakterler göz önünde bulundurarak küçük harfe cevirin
        str=str.toLowerCase(Locale.forLanguageTag("TR")); //java candır

        System.out.println(str); //java candır



    }

}
