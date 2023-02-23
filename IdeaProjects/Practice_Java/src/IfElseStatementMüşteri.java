import java.util.Scanner;

public class IfElseStatementMüşteri {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen aldığınız ürün adedini giriniz");
        int urunAdedi= kullanıcı.nextInt();
        System.out.println("Lütfen ürünün liste fiyatını giriniz");
        double listeFiyatı= kullanıcı.nextDouble();
        System.out.println("Müşteri kartınız var mı \nE:Evet  H:Hayir ?");
        char müşteriKartı=kullanıcı.next().charAt(0);

        if (müşteriKartı=='E' && urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*listeFiyatı*0.8);
        } else if (müşteriKartı=='H' && urunAdedi>0) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyatı*0.85);
        } else if (müşteriKartı=='H' && urunAdedi>10 ) {
            System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*listeFiyatı*0.85);
        }else if (müşteriKartı=='H' && urunAdedi>0){
            System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*listeFiyatı*0.9);
        }else {
            System.out.println("hatalı bilgi");
        }
    }
}
