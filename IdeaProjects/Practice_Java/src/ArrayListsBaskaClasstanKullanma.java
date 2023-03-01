public class ArrayListsBaskaClasstanKullanma {
    public static void main(String[] args) {
        // verilen sayinin pozitif tam bolenleri sayisi 10'dan cok ise "Guzel"
        // yoksa "Kotu" yazdirin


        int verilenSayı=30;
        System.out.println(ArrayListTamBölenleriBulma.pozitifBölenlerListMethodu(verilenSayı));
        int pozitifTamBolenlerSayisi=  ArrayListTamBölenleriBulma.pozitifBölenlerListMethodu(verilenSayı).size();

        if (pozitifTamBolenlerSayisi>10){
            System.out.println("good");
        }else {
            System.out.println("bad");
        }
    }
}
