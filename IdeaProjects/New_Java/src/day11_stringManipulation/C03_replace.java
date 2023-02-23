package day11_stringManipulation;

public class C03_replace {
    public static void main(String[] args) {
        String str="Java candır";
        System.out.println(str.replace('J', 'H'));//hava candır
        System.out.println(str.replaceFirst("a", ""));//jva candır, ilk a'yı değiştirir.
        System.out.println(str.replace("a", ""));//jv cndır
        System.out.println(str.replace("Java", "X"));// x candır
        System.out.println(str.replace("v", "yayaya"));//jayayayaa candır

        //str daki space leri yok etmek için

        str=str.replace(" ","");
        System.out.println(str); //javacandır


    }
}
