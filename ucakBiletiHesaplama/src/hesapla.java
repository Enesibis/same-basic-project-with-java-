import java.util.Scanner;

public class hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km, yas, tip;
        double tutar;

        System.out.println("Mesafeyi Giriniz : ");
        km = scanner.nextInt();
        tutar = km * 1;
        System.out.println("Yaşınızı Giriniz : ");
        yas = scanner.nextInt();
        if (yas < 12 && yas > 0){
            tutar = tutar - (tutar*50/100);
        }else if (yas > 12 && yas < 24){
            tutar = tutar - (tutar*10/100);
        }else if (yas > 65){
            tutar = tutar -(tutar*30/100);
        } else if (yas < 0) {
            System.out.println("Yanlış yaş seçimi yaptınız");
            System.exit(0);
        }
        System.out.println("\t***Yolculuk tipini seçiniz***");
        System.out.println("1-Tek Gidiş\t2-Gidiş/Dönüş");
        tip = scanner.nextInt();
        if (tip == 2 && yas > 0 && km > 0){
            tutar = tutar*2;
            tutar = tutar - (tutar*20/100);
            System.out.println("Yüzde yirmi indirim almaya hak kazandınız.");
            System.out.println("Gidiş Biletinizin Fiyatı : " + tutar/2 + "TL");
            System.out.println("Dönüş Biletinizin Fiyatı : " + tutar/2 + "TL");
            System.out.println("İYİ YOLCULUKLAR");
        }else if (tip == 2 && yas > 0 && km > 0){
            System.out.println("İYİ YOLCULUKLAR");
        }else {
            System.out.println("Hatalı seçim yaptınız.");
            System.exit(0);
        }
        System.out.println("Toplam Ödemeniz Gereken Miktar : " + tutar + "TL");
    }
}
