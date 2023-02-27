import java.util.Arrays;

public class ArraysMethodİleElemanEkleme {
    public static void main(String[] args) {
       // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
       // eski array’e yeni degeri atayin.

      String[]arr={"Zeynep","Merve","Ayse"};
      arr=arrayeElemanEklemeMethodu(arr,"elif");

        System.out.println(Arrays.toString(arr));

        int[] arr1 = {4,9,1,5,11,3,7,4,6};
       arr1= intElemanEkleme(arr1,39);
        System.out.println(Arrays.toString(arr1));



    }
    public static String[] arrayeElemanEklemeMethodu(String[]arr,String eklenecekEleman){
        String[]yeniArr=new String[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekEleman;
      return yeniArr;
    }
    public static int[] intElemanEkleme(int[]arr,int eklenecekDeğer){
        int[]yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniArr[i]=arr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekDeğer;
        return yeniArr;
    }



}
