package day14_methodOverloading_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        //verilen 1 den büyük bir tamsayı için asalsa true , değilse false dönen bir method olusturun
        boolean sonuc=isAsal(50);
        System.out.println(sonuc);
    }
    public static boolean isAsal(int sayı){

        int flag=0;

        for (int i = 2; i <sayı ; i++) {
            if (sayı%i==0){
                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("girilen " + sayı+" sayısı asal bir sayıdır");
            return true;
        }else {
            System.out.println("Girilen " + sayı + "sayısı asal bir sayı değildir");
            return false;
        }

    }
}
