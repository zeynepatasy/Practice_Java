public class WrapperClasses {
    public static void main(String[] args) {
        //Java primitive data türlerine methodlar ekleyerek yeni bir class olusturdu.
        //Bu class'a wrapper class deniyor
        //Wrapper class'daki data türleri non-primitivedir ve de büyük harfle baslar(class ismi gibi düşün)

        /*
        byte=Byte
        short=Short
    ****int=Integer
        long=Long
        float=Float
        double=Double
        char=Character
         */

        byte primitiveByte=12;
        Byte nonPrimitive=12;
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println( Byte.MAX_VALUE);//127

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MIN_VALUE);

        //sayısal değerlerin Stringe çevrilmesi ==>ValuOf ve toString methoduyla olur.
        int a=5;
       // String str=Integer.toString(a);
        double b=5.3;
       // String str2=Double.toString(b);
        System.out.println(a+b); //bu istedeğim sonucu vermedi
        System.out.println(a+" " +  b);//burda oldu

        //String bir ifadeyi sayısal bir değere çevirmek istiyorsak 2 method vardır
        //ValueOf ve de parseInt

        String str="789";
        //bu ifadeye 10 eklyeip 799 yapalım.Bunun için valueOf ve parseInt methodunu kullanabiliriz.
        int sonuc=Integer.parseInt(str);
        System.out.println(sonuc);
        sonuc=Integer.valueOf(str);
        System.out.println(sonuc+10);


    }
}
