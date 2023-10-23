import java.util.Scanner;

public class ParaCek extends Degiskenler{
    AtmManager atmManager = new AtmManager();
    public void withDrawal(){
        Scanner scanner = new Scanner(System.in);
        int miktar, secim, bakiye1;
        boolean sorgu = false;
        System.out.println("Çekmek İstediğiniz Miktarı Giriniz : ");
        miktar = scanner.nextInt();
        System.out.println("Para Sayılıyor...");
        System.out.println("Çekmek İstediginiz Miktar " + miktar + "TL mi?");
        System.out.println("1-EVET\t2-HAYIR\t3-İptal");
        secim = scanner.nextInt();
        if (secim == 1){
            System.out.println("Para Çekme İşlemi Başarılı\nAna Sayfaya Yönlendiriliyorsunuz...");
            atmManager.islemler();
        } else if (secim == 2) {
            System.out.println("Tekrar Deneyiniz...");
            withDrawal();
        } else if (secim == 3) {
            System.out.println("Ana Sayfaya Yönlendiriliyorsunuz...");
            atmManager.islemler();
        } else {
            System.out.println("Hatalı Tuşlama Yaptınız Tekrar Deneyiniz");
            withDrawal();
        }
    }
}
