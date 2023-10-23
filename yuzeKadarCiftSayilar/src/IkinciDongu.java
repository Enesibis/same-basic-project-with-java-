import java.util.Scanner;

public class IkinciDongu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, toplam;
        toplam = 0;
        while(true){
            System.out.println("Bir Sayi girin : ");
            a = scanner.nextInt();
            if (a < 0){
                System.out.println("döngü sonlandı.");
                System.out.println("Girlen tek sayılar toplamı : " + toplam);
                break;
            }
            if(a%2 == 1){
                toplam = toplam + a;
            }
        }
    }
}
