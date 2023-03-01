import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.
        System.out.println(kullanıcıyaListOlusturtma());
    }

    public static List<String>kullanıcıyaListOlusturtma(){
        List<String>isimlerList=new ArrayList<>();
        String isimler=" ";
        Scanner kullanıcı=new Scanner(System.in);

       do {
           System.out.println("Lütfen liste olusturmak için isimler giriniz"+
                   "\nBitirmek için q basınız");
           isimler= kullanıcı.nextLine();
           if (!isimler.equalsIgnoreCase("q")){
               isimlerList.add(isimler);
           }
       }while (!isimler.equalsIgnoreCase("q"));
return isimlerList;
        }

    }

