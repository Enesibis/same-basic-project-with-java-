import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yildiz, i, k;
        yildiz = scanner.nextInt();
        i = 1;
        while (i <= yildiz){
            k = 1;
            while (k <= i){
                System.out.print(" * ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
