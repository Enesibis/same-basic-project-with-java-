public class Main {

    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 28;

        if (sayi1 > sayi2 && sayi1 > sayi3){
            System.out.println("En Büyük Sayı : "+sayi1);
        }
        else if (sayi2 > sayi1 && sayi2 > sayi3){
            System.out.println("En Büyük Sayı : "+sayi2);
        }
        else {
            System.out.println("En Büyük Sayı : "+sayi3);
        }
    }
}