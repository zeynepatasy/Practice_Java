package day15_doWhileLoop_scope;

public class C02_RakamlarToplamınıBulMethodu {

        //verilen pozitif bir tamsayının
        //rakamlar toplamını bize döndüren method olusturun



    public static int rakamlarToplamı(int girilensayı){
        int sayı=girilensayı;
        int birlerBasamağı=0;
        int rakamlarToplamı=0;

        int basamakSayısı=(sayı+"").length(); //string haline getirdik lenght e ulasmak içim

        for (int i = 1; i <=basamakSayısı ; i++) {
            birlerBasamağı=sayı%10;
            rakamlarToplamı+=birlerBasamağı;
            sayı/=10;
        }

        return rakamlarToplamı;
    }
}
