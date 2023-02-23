import java.util.Objects;
import java.util.Scanner;

public class IfElse3 {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

        Scanner kullanıcı=new Scanner(System.in);
        System.out.println("Lütfen iş ünvanınızı giriniz");
        
        String jobTitle= kullanıcı.nextLine();
        
        if (jobTitle.equalsIgnoreCase("qa")){
            System.out.println("İş ünvanınız: " + "Quality Analyst");
        } else if (jobTitle.equalsIgnoreCase("dev")) {
            System.out.println("İş ünvanınız: " + "Developer");
        } else if (jobTitle.equalsIgnoreCase("ba")) {
            System.out.println("İş ünvanınız: " + "Business Analyst");
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("İş ünvanınız: " + "Project Manager");
        }else {
            System.out.println("Yanlış giriş yaptınız");
        }
    }
}