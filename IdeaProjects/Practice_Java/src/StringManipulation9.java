import java.util.Scanner;

public class StringManipulation9 {
    public static void main(String[] args) {
 /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String str= kullanıcı.nextLine();

        if (str.length()% 2== 1 && str.length()>=3){
            System.out.println("kelimenin ortasındaki karakter:" +str.charAt( str.length()/2));
            System.out.println(str.substring(str.length()/2));
        }else {
            System.out.println("kelime: " + str);
        }
        kullanıcı.close();
    }
}
