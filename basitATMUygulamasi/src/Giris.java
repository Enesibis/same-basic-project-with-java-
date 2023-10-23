import java.util.Scanner;

public class Giris extends Degiskenler{
    public void basla(){
        Scanner scanner = new Scanner(System.in);
        boolean sifre2 = false;
        int secim, sifre1;
        System.out.println("\t\t\t****Ziraat Bankasına Hoş Geldiniz****");
        System.out.println("Şifrenizi giriniz : ");
        sifre1 = scanner.nextInt();
        if (sifre1 == sifre){
            System.out.println("Giriş Başarılı\nAna Sayfaya Yönlendiriliyorsunuz...");
            sifre2 = true;
        }else {
            System.out.println("Yanlış şifre girdiniz.\nKart İdade Ediliyor...");
            sifre2 = false;
            System.exit(0);
        }
    }
}
