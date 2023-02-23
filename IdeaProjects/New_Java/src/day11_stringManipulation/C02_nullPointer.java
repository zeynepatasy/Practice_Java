package day11_stringManipulation;

public class C02_nullPointer {
    public static void main(String[] args) {
        //null bir değer değildir
        //null bir pointer'dır, yanına yazıldığı non-primitive variable'a değer atanmadığını işaret eder.

        String str;
        //str olusturuldu ama değer atanmadı
        //java method icerisinde değer atamadan variable olusturulmasına izin verir
        //ama değer atamadan kullanılmasına izin vermez
        //str.concat("Java");CTE

        //Bazen programlarda variable lar oluşturulur ama
        // daha sonra değer atanacağı için değer ataması yapılmaz
        //değer ataması yapılmadan listeleme bile CTE verdiği için
        // değer verilmedğini işaretleyecek ama CTE olusmasını engelleyecek
        //bir çözüm olarak null pointer olsuturulmustur

        str=null;
        // buna null atanmamıs sadece null isaretlenmıs (null pointer)
        //değeri null atanmıs olması için str="null"; böyle olması gerekir

       System.out.println(str);
        //System.out.println(str.concat("Java")); //NullPointerException Run Time Error null işaretlenmiş bir variable a method kullanamazsın.
       // System.out.println(str.length()); //NullPointerException

        System.out.println(str + "java"); //nulljava

        String str2=str+"Java";
        System.out.println(str2);//nulljava
        //toplamya izin veriyor ancak method kullanmaya izin vermiyor

        //primitive data türlerini kapsamaz int sayi=null; kabul etmez

        //biz genelde String bir ifade ousturup, sonra değer atayacksak
        //hiçlik değeri atarız

        String str3="";
        //atanan değer hiçliktir

        System.out.println(str3.concat("java")); //java
        //System.out.println(str.isEmpty()); //null pointer exception //null olarak işaretlenmiş

        System.out.println(str3.isEmpty()); //true


    }
}
