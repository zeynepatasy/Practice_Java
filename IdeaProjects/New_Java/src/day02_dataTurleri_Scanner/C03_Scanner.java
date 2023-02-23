package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in); //dışarıdan aldığı için in
        // 1.adım:dışarıdan bilgi almak için scanner objesi olusturmak gerekir.
        //2.adım: kullancıya ne istediğinizi söyleyin
        System.out.println("lütfen isminizi giriniz");//dısarıya çıkardığı için out
         //3.adım: girilen bilgiyi içine koyacağımız bir variable oluşturun.
        String kullanıcıİsim=scan.next();
        System.out.println("girilen isim:" + kullanıcıİsim);

    }
}
