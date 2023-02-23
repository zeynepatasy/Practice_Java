package day15_doWhileLoop_scope;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        int sayi = -10;
        int toplam = 0;
        while (sayi>0){
            toplam += sayi*sayi;
            sayi--;
        }
        System.out.println("while toplam : " + toplam);
        sayi= -10;
        toplam = 0;
        do {
            toplam += sayi*sayi;
            sayi--;
        }while(sayi>0);
        System.out.println("do while toplam : " + toplam);
    }
}
