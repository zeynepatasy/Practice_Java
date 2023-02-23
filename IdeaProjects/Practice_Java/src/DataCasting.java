public class DataCasting {
    public static void main(String[] args) {
         //implicit data casting daha küçük kapsamlıı bir data türünü,daha büyük kapsamlı bir data türüne atamaktır
        //java bunda bir sorun görmez ve kendiliğinden yapar

        int a=12;
        int c=167;
        double d=c;

        //expilict data casting ise daha büyük bir data türünü, daha küçük bir data türüne atamaktır.
        //Bu gibi durumlarda java bunu bize sorup yapar çünkü veri kayıplarına sebep olabilir.
        int a1=12;     byte e= (byte) a1;
        int c1=167;     byte f=(byte) c1;


        //char ifadeler bu durumdan farklıdır.
        // Çünkü değerlerin ascii sayılarını tuuttuğu için  değere karşilik gelen sayıyla matematiksel işlemlere dahil olur.

        char ch= 't';
        ch='%';
        ch=' ';
        ch=99;

        int z= 'a'+'c';
        System.out.println('a' + 'c');//burda ascii değerler olarak topladı

        System.out.println( " " +'a'  + 'c'); //string güçlü olduğu ifadeyi strinde çevirdi

        //boolean ifadelerde durum şöyledir.Sadece true ve false olarak kabul eder.
        boolean bl= false;
        bl= true;
        //bl="true";
        // bl=20;
        // bl='a';
    }
}
