public class IndexOf {
    public static void main(String[] args) {
       // String str = "Javayi iyi ogrenmek icin cok calismam lazim cok.";

        // ilk a'nin index'ini yazdiralim

       // System.out.println(str.indexOf("a"));
        //System.out.println(str.indexOf("j", 0));

        // son a'nin index'ini yazdirin
        //System.out.println(str.lastIndexOf("a"));

       // System.out.println(str.lastIndexOf("a", 39));

        // verilen str'da cok kelimesinin kullanimini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        // sonuclarindan uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calismam lazim cok.
        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok.";
        int ilkCokIndexi= str.indexOf("ogrenmek");
        int sonCokIndexi= str.lastIndexOf("ogrenmek");
        System.out.println(ilkCokIndexi);
        System.out.println(sonCokIndexi);

        if (! (str.contains("ogrenmek"))) {
            System.out.println("cok kelimesi kullanilmamis");
        } else if (ilkCokIndexi==sonCokIndexi) {
            System.out.println("bir kez kullanilmis");
        }else {
            System.out.println("aranan kelime birden fazla kez kullanılmıs");

        }

    }
}



