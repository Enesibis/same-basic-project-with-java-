import java.util.Scanner;

public class AtmManager extends Degiskenler{
    public void islemler(){
        int sec;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ***");
        System.out.println("1-Para Yatır\t2-Para Çek\t3-Bakiye Sorgu\t4-Çıkış Yap");
        sec = scanner.nextInt();
        if (sec == 1){
            ParaYatir paraYatir = new ParaYatir();
            paraYatir.deposit();
        } else if (sec == 2) {
            ParaCek paraCek = new ParaCek();
            paraCek.withDrawal();
        } else if (sec == 3) {
            BakiyeSorgu bakiyeSorgu = new BakiyeSorgu();
            bakiyeSorgu.balance();
        } else if (sec == 4) {
            Cikis cikis = new Cikis();
            cikis.exit();
        }else {
            System.out.println("Yanlış Tuşlama Yaptınız.");
            System.exit(0);
        }
    }
}
