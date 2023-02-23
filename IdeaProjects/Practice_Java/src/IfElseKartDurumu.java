import java.util.Scanner;

public class IfElseKartDurumu {
    public static void main(String[] args) {
        // kart ana degisken olsun
          /* Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/
        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("alacağınız ürün adedini giriniz");
        int ürünAdedi= kullanıcı.nextInt();
        System.out.println("ürünün liste fiyatını giriniz");
        double listeFiyatı= kullanıcı.nextDouble();
        System.out.println("müsteri kartınız var mı ? \nEvet:E Hayır:H");
        char müsteriKartı=kullanıcı.next().charAt(0);

        if (müsteriKartı=='E' || müsteriKartı=='e'){
            if (ürünAdedi<=0){
                System.out.println("gçersiz ürün miktarı girdiniz");
            } else if (ürünAdedi>10) {
                System.out.println("%20 indirimli toplam fiyat : " + ürünAdedi*listeFiyatı*0.8);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + ürünAdedi*listeFiyatı*0.85);
            }

        } else if (müsteriKartı=='H' || müsteriKartı=='h') {
            if (ürünAdedi<=0){
                System.out.println("gçersiz ürün miktarı girdiniz");
            } else if (ürünAdedi>10) {
                System.out.println("%15 indirimli toplam fiyat : " + ürünAdedi*listeFiyatı*0.85);
            }
            else {
                System.out.println("%10 indirimli toplam fiyat : " + ürünAdedi*listeFiyatı*0.9);
            }


            }else
            {
            System.out.println("kart bilgisi gecersiz");
        }
    }
}
