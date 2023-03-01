import java.util.ArrayList;
import java.util.List;

public class ArrayListsBaskaClasstanMethodÇalıştırma {
    public static void main(String[] args) {
        // C05'deki istenmeyenleri sil methodunu buradan kullanalim

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cikolatali Gofret");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        System.out.println(ArrayListsİstenmeyenDeğeriBulmaMethod.istenmeyenHarfIcerenleriSil(urunler, "C"));
    }
}
