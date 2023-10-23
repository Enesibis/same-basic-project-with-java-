import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int can, tahmin, sayi;
        can = 5;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        sayi = random.nextInt(100);
        boolean oyun = false;
        System.out.println(sayi);

        System.out.println("Oyuna hoş geldininz");
        System.out.println("0 ile 100 arasında bir sayı tahmin ediniz.");

        while (can <= 5 && can > 0){
            System.out.println("Tahmininiz : ");
            tahmin = scanner.nextInt();

            if (tahmin < 0 || tahmin > 99){
                System.out.println("Yanlış giriş yaptınız.0 ile 100 arasında bir sayı giriniz.");
            } else if (tahmin == sayi) {
                oyun = true;
                break;
            }else{
                System.out.println("Yanlış Tahmin yaptınız.Tekrar Deneyin.\nKalan can : " + --can);
            }
        }
        if (oyun){
            System.out.println("Tebrikler doğru tahmin");
            System.out.println("Sayı : " + sayi);
            System.out.println("Kalan can : " + can);
        }else{
            System.out.println("Oyunu kaybettiniz ");
        }
    }
}