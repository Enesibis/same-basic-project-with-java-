import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fak, sayi;
        fak = 1;
        System.out.println("Faktörielini hesaplamak istediğiniz sayıyı giriniz : ");
        sayi = scanner.nextInt();
        while (sayi > 0){
            fak *= sayi;
            sayi--;
        }
        System.out.println("Girdiğiniz sayının faktörieli : " + fak);
    }
}
