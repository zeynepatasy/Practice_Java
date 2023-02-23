public class ForLoopFaktoryel {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        int sayı=5;
        int faktoryel=1;

        for (int i = 1; i <=5 ; i++) { //int i=sayı; i>=1; i--

            faktoryel*=i;
        }
        System.out.println("faktoryel: " + faktoryel);
    }


}
