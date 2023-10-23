import java.util.Scanner;

public class hesapla {
    public static void main(String[] args) {
        double urunFiyati, kdv, kdvliFiyat;
        kdv = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün Fiyatını Giriniz : ");
        urunFiyati = input.nextDouble();
        kdvliFiyat = urunFiyati + (urunFiyati*kdv);
        System.out.println("Ürünün kdvli fiyatı : " + kdvliFiyat);
    }
}
