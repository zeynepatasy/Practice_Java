package day10_stringManipulation;

public class C05_ındexOf {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";
        System.out.println(str.indexOf("c")); //5
        System.out.println(str.indexOf("a"));//birden fazla ise ilk bukduğunu verir.//1

        System.out.println(str.indexOf("cok")); //ilk baslangıc indexini söyler yani 5 olur.
        str.indexOf("cok",6); //cok arıyorum ama 6.indexten sonrasında //13
        System.out.println(str.indexOf("cok", 5));

        // Verilen bir cumlede, istenen bir String icin // asagidaki cumlelerden uygun olani yazdirin //

        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis


    }
}
