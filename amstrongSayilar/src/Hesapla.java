import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, n, toplam, basamak;
        toplam = 0;
        System.out.println("Bir sayı giriniz : ");
        n = scanner.nextInt();
        for (i = 0 ; i < n ; i++){
            if (n < 10){
                toplam += n*n*n;
            }else {
                basamak = n % 10;
                toplam += basamak * basamak * basamak;
                n = n / 10;
            }
        }
        if (toplam == n){
            System.out.println("Girdiğiniz sayı amstrongdur.");
        }else {
            System.out.println("Girdiğiniz sayı amstrong değildir.");
        }
    }
}
