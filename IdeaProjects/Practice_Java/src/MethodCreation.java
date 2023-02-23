public class MethodCreation {
    public static void main(String[] args) {

            /*
             * String parametreli bir metod yazin ve  girililen String icindeki digitlerin
             * toplamini dondursun.
             *
             * Ornek
             * input : ade1r4d3
             * output : 8
             *
             * Ipucu:
             *     Character.isDigit()
             *     Integer.valueOf()
             */
       int toplam= stringToplama("1900","2500");
    digitToplama("ade1r4d3");

    }
     public static int stringToplama(String str1,String str2){
        int toplam= Integer.valueOf(str1)+ Integer.valueOf(str2);
         System.out.println(toplam);
         return toplam;
     }
     public static int sayıToplamı(int sayı1, int sayı2){
        int toplam=sayı1+sayı2;
        return toplam;
     }

     public static int digitToplama(String str){
        int toplam=0;

         for (int i = 0; i <str.length() ; i++) {
             if (Character.isDigit(str.charAt(i))){
                 toplam+=Integer.valueOf(""+ str.charAt(i));
             }
         }
         System.out.println("girilen stringdeki sayilarin toplami " + toplam);
         return toplam;

     }
}
