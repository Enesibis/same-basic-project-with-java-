import java.util.Scanner;

public class DaireninCevresi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cevre, pi, yaricap;
        pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = input.nextDouble();
        cevre = 2*pi*yaricap;
        System.out.println("Dairenin Çevresi : " + cevre);
    }
}
