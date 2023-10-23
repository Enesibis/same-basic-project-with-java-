import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alan, pi, yaricap;
        pi = 3.14;
        System.out.println("Dairenin yarıçapını giriniz : ");
        yaricap = input.nextDouble();
        alan = pi*yaricap*yaricap;
        System.out.println("Dairenin Alanı : " + alan);
    }
}
