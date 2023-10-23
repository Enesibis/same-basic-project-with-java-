import java.util.Scanner;

public class etkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz : ");
        sicaklik = scanner.nextInt();
        if (sicaklik >= 30){
            System.out.println("Yüzmeye gidebilirsiz.");
        }else if (sicaklik > 5){
            System.out.println("Sinemaya gidebilirsiz.");
        }else if (sicaklik <= 4){
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        }
    }
}
