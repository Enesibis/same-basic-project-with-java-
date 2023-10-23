import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, i;
        double toplam;
        i = 1;
        toplam = 0;
        System.out.println("Bir sayı giriniz : ");
        n = scanner.nextInt();
        while (i <= n){
            toplam += 1 / i;
            i++;
        }
        System.out.println("Girdiginiz sayının harmonik toplamı : " + toplam);
    }
}
