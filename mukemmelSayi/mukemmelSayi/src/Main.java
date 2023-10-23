public class Main {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;
        int i ;

        for (i = 1; i < number; i++){
            if (number%i == 0){
                total = total + i;
            }
        }
        if (number == total){
            System.out.println("Sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir.");
        }
    }
}