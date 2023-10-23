import java.util.Scanner;

public class KonsoldanVeriAlma {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int a, b;
            /*System.out.println("A sayısını giriniz : ");
            a = input.nextInt();
            System.out.println("B sayısını giriniz : ");
            b = input.nextInt();
            System.out.println("A sayısı : " + a);
            System.out.println("B sayısı : " + b);*/

            /*double c;
            System.out.println("Double türünde sayı giriniz : ");
            c = input.nextDouble();
            System.out.println("Girilen sayı : " + c);*/

            String mesaj;
            System.out.println("Mesajınızı giriniz : ");
            mesaj = input.nextLine();
            System.out.println(mesaj);
        }
}
