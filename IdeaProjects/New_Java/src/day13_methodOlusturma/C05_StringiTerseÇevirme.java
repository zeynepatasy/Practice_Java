package day13_methodOlusturma;

public class C05_StringiTerseÇevirme {

    public static void main(String[] args) {
        System.out.println(stringiTersineÇevir("Java candır"));

    }

    public static String stringiTersineÇevir(String metin){
        String tersmetin="";

        for (int i = metin.length()-1; i >=0 ; i--) {
            tersmetin+=metin.charAt(i);

        }
        return tersmetin;

    }
}
