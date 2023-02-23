public class ForLoop9 {
    public static void main(String[] args) {
        // loop kullanarak verilen bir String’i terse cevirip, bu halini bize
        //donduren bir method olusturun.

        String str="While Loop zormus";
        String terstenGelenler=" ";


        for (int i = str.length()-1; i >=0 ; i--) {
            terstenGelenler+=str.charAt(i);
        }
        System.out.println(terstenGelenler);
    }

}
