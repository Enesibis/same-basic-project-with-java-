import java.util.Scanner;

public class Hesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, sayi1, sayi2, temp, n;
        sayi1 = 0;
        sayi2 = 1;
        System.out.println("Bir sayı giriniz : ");
        n = scanner.nextInt();
        if (n < 3){
            if (n == 1){
                System.out.println(sayi1);
            } else if (n == 2) {
                System.out.print(sayi1);
                System.out.print(" ");
                System.out.print(sayi2);
            }else {
                System.out.println("Hatalı Giriş Yaptınız. ");
            }
        }else {
            System.out.print(sayi1);
            System.out.print(" ");
            System.out.print(sayi2);
            System.out.print(" ");

            for (i = 3; i <= n; i++){
                temp = sayi1 + sayi2;
                System.out.print(temp);
                System.out.print(" ");

                sayi1 = sayi2;
                sayi2 = temp;
            }
        }
    }
}