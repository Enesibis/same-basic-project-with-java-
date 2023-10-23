import java.util.Scanner;

public class ParaYatir extends Degiskenler{
    AtmManager atmManager = new AtmManager();
    public void deposit(){
        Scanner scanner = new Scanner(System.in);
        int miktar, secim;
        boolean sorgu = false;
        System.out.println("Yatırmak İstediğiniz Miktarı Giriniz : ");
        miktar = scanner.nextInt();
        System.out.println("Para Sayılıyor...");
        System.out.println("Yatırmak İstediginiz Miktar " + miktar + "TL mi?");
        System.out.println("1-EVET\t2-HAYIR\t3-İptal");
        secim = scanner.nextInt();
        if (secim == 1){
            System.out.println("Para Yatırma İşlemi Başarılı\nAna Sayfaya Yönlendiriliyorsunuz...");
            setBakiye(miktar);
            atmManager.islemler();
        } else if (secim == 2) {
            System.out.println("Paranız İade Ediliyor Tekrar Deneyiniz..");
            deposit();
        } else if (secim == 3) {
            System.out.println("Ana Sayfaya Yönlediriliyorsunuz...");
            atmManager.islemler();
        } else {
            System.out.println("Hatalı Tuşlama Yaptınız Tekrar Deneyiniz");
            deposit();
        }
    }
}
