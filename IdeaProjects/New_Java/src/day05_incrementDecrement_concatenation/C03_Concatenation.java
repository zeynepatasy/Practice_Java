package day05_incrementDecrement_concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {
        //Bir String bir String veya basşka bir data türünden bir variable ile
        //+işareti ile birleştirilebilir.

        String a="Java";
        String b="güzeldir";

        System.out.println(a + " " + b);

        int c=10;
        int d=20;
        System.out.println(a+b+c); //javagüzeldir10
        //eğer String ile baska bir değer toplanırsa Java sonucu String yapar.
        System.out.println(a+(c+d));//parantez önceliği //java30 işlem önceliği
        System.out.println(a+c*d);//java200 işlem öncelği çarpma
        System.out.println(d+c+a);//30java işlem önceliği

        //concatenation da parantez ve işlem önceliği önemlidir.

    }
}
