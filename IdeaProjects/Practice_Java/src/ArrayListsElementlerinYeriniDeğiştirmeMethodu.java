import java.util.ArrayList;
import java.util.List;

public class ArrayListsElementlerinYeriniDeğiştirmeMethodu {
    public static void main(String[] args) {
        // odev : verilen bir listede, istenen 2 index'deki elementlerin yerini degistirip
        //        yeni listeyi bize donduren bir method olusturun


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(8);
        sayilar.add(7);
        sayilar.add(6);
        sayilar.add(5);
        System.out.println(sayilar);//[8, 7, 6, 5]

        //1.indexle 3 .index yer değiştir
        List<Integer>sayılar2=yerDeğiştirmeMethodu(sayilar);
        System.out.println(sayılar2);//[8, 5, 6, 7]
    }
    public static List<Integer>yerDeğiştirmeMethodu(List<Integer>sayilar){
        int temp= sayilar.get(3);
        sayilar.set(3,7);
        sayilar.set(1,temp);
        return sayilar;
    }
}
