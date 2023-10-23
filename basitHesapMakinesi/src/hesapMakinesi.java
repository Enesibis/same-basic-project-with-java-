import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, secim;
        System.out.println("Birinci sayıyı giriniz : ");
        a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        b = scanner.nextInt();

        System.out.println("\t\t***İŞLEM SEÇİN***");
        System.out.println("1-Toplama\t2-Çıkarma\t3-Çarpma\t4-Bölme");

        System.out.println("Seçiminizi Girin : ");
        secim = scanner.nextInt();
        switch (secim){
            case 1:
                System.out.println("Toplama işleminin sonucu : " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma işleminin sonucu : " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma işleminin sonucu : " + (a * b));
                break;
            case 4:
                double bolum;
                bolum = a / b;
                System.out.println("Bölme işleminin sonucu : " + bolum);
        }
    }
}
