package day14_methodOverloading_whileLoop;

public class C01_AsalSayıYazdır {
    public static void main(String[] args) {
        //verilen pozitif bir tam sayının asal sayı olup olmadğını yazdırdan bir method olusturun


           asalSayı(23);
           asalSayı(20);
    }
    public static void asalSayı(int sayı){
        int flag=0;
        for (int i = 2; i <sayı ; i++) {
            if (sayı%i==0) {

                flag++;
                break;
            }
        }
        if (flag==0){
            System.out.println("girilen " + sayı+" sayısı asal bir sayıdır");

        }else {
            System.out.println("Girilen " + sayı + "sayısı asal bir sayı değildir");
        }
        }
    }

