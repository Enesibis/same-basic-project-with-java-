import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asal;
        int i, n;
        asal = false;
        System.out.println("Bir sayı giriniz : ");
        n = scanner.nextInt();
        if (n < 1){
            System.out.println("Negatif sayılar ve sıfır asal olamaz!\n");
            System.exit(0);
        }
        else if (n == 1){
            asal = false;
        } else if (n == 2) {
            asal = true;
        }else {
            for (i = 2 ; i < n ; i++){
                if (n%i == 0){
                    asal = false;
                    break;
                }
                else{
                    asal = true;
                }
            }
        }
        if (asal == true){
            System.out.println("Girdiğiniz sayı asaldır.");
        }else {
            System.out.println("Girdiğiniz sayı asal değildir.");
        }
    }
}
