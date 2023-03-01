import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListsİstenmeyenDeğeriBulmaMethod {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun


        List<String> liste = ArrayLists.kullanıcıyaListOlusturtma();
        Scanner kullanıcı = new Scanner(System.in);
        System.out.println("Lütfen istenmeyen harfi giriniz");
        String istenmeyenDeğer= kullanıcı.next().substring(0,1);
        System.out.println(istenmeyenHarfIcerenleriSil(liste, istenmeyenDeğer));


    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String>list,String istenmeyenDeğer) {
        List<String>kalanlarListesi=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).contains(istenmeyenDeğer)){
                kalanlarListesi.add(list.get(i));
            }
        }
return kalanlarListesi;
    }
}