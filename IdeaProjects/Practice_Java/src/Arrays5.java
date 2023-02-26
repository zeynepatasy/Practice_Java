import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        //1.adim : str tanimladik
        
        //1.yol
        String str = "HeySiri";
        str=str.replace("Hey","Bye");
        String[] arr=new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
        
        //2.yol
        String str1="HeySiri";
        String[] yeniStr=str1.split("y");
        yeniStr[0]="Bye";
        str1=yeniStr[0] + yeniStr[1];
        System.out.println("str1 = " + str1);
        String[]yeniStr1=new String[1];
        yeniStr1[0]=str1;
        System.out.println(Arrays.toString(yeniStr1)); //0'a atamazsak ayrı yazar
        


        
    }
}
