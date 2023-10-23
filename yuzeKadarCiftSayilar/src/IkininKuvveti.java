import java.util.Scanner;

public class IkininKuvveti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, i;
        i = 1;
        System.out.println("Bir sayi girin : ");
        a = scanner.nextInt();
        while (i <= a){
            System.out.println(i);
            i = i * 2;
        }
    }
}
