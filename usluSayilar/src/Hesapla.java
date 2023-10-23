import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, i, sonuc;
        sonuc = 1;
        i = 1;
        System.out.println("Üssü alınacak sayıyı giriniz : ");
        sayi1 = scanner.nextInt();
        System.out.println("Üs olacak sayıyı giriniz : ");
        sayi2 = scanner.nextInt();
        while (i <= sayi2){
            sonuc = sonuc * sayi1;
            i++;
        }
        System.out.println("Sonuç : " + sonuc);
    }
}
