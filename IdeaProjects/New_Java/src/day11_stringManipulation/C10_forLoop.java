package day11_stringManipulation;

public class C10_forLoop {
    public static void main(String[] args) {
        //50 den baslayıp 100'e kadar (dahil)
        //sayıları yan yana aralarında bir boşluk olacak sekilde yazdırın

        for (int i = 50; i <=100 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //3 basamaklı sayılardan 23 ile bölünebilenleri yanyana aralarında bir boşluk ile yazdırın

        for (int i = 100; i <=999 ; i++) {
            if (i%23==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println("");
        for (int i = 20; i <=100 ; i+=7) {
            System.out.print(i);
        }
        System.out.println(" ");

        for (int i = 100; i >=1 ; i--) {
            if (i%7==0){
                System.out.print(i+ " ");
            }
        }
    }
}
