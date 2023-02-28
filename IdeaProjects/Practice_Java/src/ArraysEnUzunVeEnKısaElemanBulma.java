public class ArraysEnUzunVeEnKısaElemanBulma {
    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.
        String[]str={"Zeynep","Merve","Ayse"};
        enUzunKısaElemanBulma(str);

    }

    public static void enUzunKısaElemanBulma(String[]str){
        String enUzunKelime=str[0];
        String enKısaKelime=str[0];
        for (int i = 0; i <str.length ; i++) {
            if (str[i].length()>enUzunKelime.length()){
                enUzunKelime=str[i];
            }
            if (str[i].length()<enKısaKelime.length()){
                enKısaKelime=str[i];
            }
        }
        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kısa kelime : " + enKısaKelime);
    }
}
