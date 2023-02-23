package day10_stringManipulation;

public class C01_Substring {
    public static void main(String[] args) {
        String str="Java ne kadar güzel";
//Substring iki farklı sekilde kullanılır
        //1-tek parametre olursa , o index den baslar sona kadar yazdırır
        System.out.println( str.substring(8));
        System.out.println(str.substring(0));
        System.out.println(str.substring(str.length() -3));
        System.out.println(str.substring(str.length()));//hiçlik
       // System.out.println(str.charAt(str.substring())); uzunlluğu 19 son harf index 18 19.karakter yok hata verir.

    //2-İki parametre girilirse  baslangıç (dahil) ındexten baslar
    //bitiş (hariç)  ındexine kadar olan böülümü yazdırır.
        System.out.println(str.substring(5,7));//ne
        System.out.println(str.substring(3,4));//a
        System.out.println(str.substring(0,1));//j

        //5.indexteki karakter
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,6));//n

        System.out.println(str.substring(2,2)); //2yi buluyor ama o dahil olmadığı için hiçlik oluyor.
        System.out.println(str.substring(5,1)); //ileriden geri gidiyor hata verir.Run Time Error.


    }
}
