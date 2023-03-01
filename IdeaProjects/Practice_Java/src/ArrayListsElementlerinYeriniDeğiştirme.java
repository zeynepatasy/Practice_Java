import java.util.ArrayList;
import java.util.List;

public class ArrayListsElementlerinYeriniDeğiştirme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        // 2.indexdeki element ile 5.index'deki elementin yerini degistirin
        //1 ve 7 yer değiştirecek

        int temp=sayilar.get(2);
        // 2.index'e 5.index'deki degeri atayalim

    sayilar.set(2, sayilar.get(5));
        // 5.index'e temp'deki degeri atayalim
     sayilar.set(5,temp);


    }
}
