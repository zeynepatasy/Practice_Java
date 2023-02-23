public class StringManipulation5 {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */

       String strr1="$13.99";
       String strr2="$10.55";
       String ilkKaraktersiz=strr1.substring(1);
       String ilkKaraktersiz2=strr2.substring(1);

        Double str1=Double.parseDouble(ilkKaraktersiz);
        Double str2=Double.parseDouble(ilkKaraktersiz2);
        System.out.println(ilkKaraktersiz);
        System.out.println(ilkKaraktersiz2);

      int toplam= (int) (str1+str2);
        System.out.println(toplam);



    }
}
