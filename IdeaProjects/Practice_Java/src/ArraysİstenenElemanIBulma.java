public class ArraysİstenenElemanIBulma {
    public static void main(String[] args) {
      //  Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       // kullanildigini yazdiran bir method olusturun.
        int[] arr1 = {4,9,1,5,11,3,7,4,6};
        String[]arr={"Zeynep","Merve","Ayse"};
        stringİstenenElemanBulma(arr,"ali");
        istenenElemanıBulma(arr1,4);
    }
    public static void istenenElemanıBulma(int[] arr,int istenenEleman){
        int sayaç=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenEleman){
                sayaç++;
            }
        }
        System.out.println("İstenen eleman: " + istenenEleman);
        System.out.println("istenen elemanın kullanım sayısı: " + sayaç);

    }

    public static void stringİstenenElemanBulma(String[]str,String istenenEleman){
        int sayac=0;
        for (int i = 0; i <str.length ; i++) {
           if (str[i].equals(istenenEleman)){
               sayac++;
           }
        }
        System.out.println("istenen eleman : " + istenenEleman);
        System.out.println("istenen elemanın sayısı : " + sayac);
    }
}
