import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
       // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
       // eski array’e yeni degeri atayin.

      String[]arr={"Zeynep","Merve","Ayse"};
      String[]yeniarr=new String[arr.length+2];
        for (int i = 0; i < arr.length ; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-2]="Eda";
        yeniarr[yeniarr.length-1]="tuğba";
        System.out.println(Arrays.toString(yeniarr));
    }


}
