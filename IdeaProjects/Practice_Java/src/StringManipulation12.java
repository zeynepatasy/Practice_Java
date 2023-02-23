import java.util.Scanner;

public class StringManipulation12 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime giriniz");
        String kelime= kullanıcı.nextLine();

        char ilkHarf=kelime.charAt(0);
        char ikinciHarf=kelime.charAt(1);
        char ücüncüHarf=kelime.charAt(2);
        char dördüncüHarf=kelime.charAt(3);

        System.out.println("kelimenin tersten yazılısı: " + dördüncüHarf + ücüncüHarf+ikinciHarf+ilkHarf);
    }
}
