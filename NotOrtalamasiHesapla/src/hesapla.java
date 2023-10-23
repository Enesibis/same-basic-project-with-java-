import java.util.*;

public class hesapla {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int quiz, vize, final_;
                double ortalama;
                System.out.println("Quiz Notunuzu Giriniz : ");
                quiz = input.nextInt();
                System.out.println("Vize Notunuzu Giriniz : ");
                vize = input.nextInt();
                System.out.println("Final Notunuzu Giriniz : ");
                final_ = input.nextInt();

                ortalama = (quiz * 10 / 100) + (vize * 40 / 100) + (final_ * 50 / 100);
                System.out.println("Ortalamanız : " + ortalama);
                if (ortalama<50){
                        System.out.println("Kaldınız ");
                }else {
                        System.out.println("Geçtiniz ");
                }
        }
}
