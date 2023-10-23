public class Main {
    public static void main(String[] args) {
        int number = 13;
        int i;
        int asal = 1;

        for (i = 2; i < number; i++){
            if (number % i == 0){
                asal = 0;
            }
        }
        if (asal == 1 && number>1){
            System.out.println("Sayı Asaldır.");
        }
        else{
            System.out.println("Sayı Asal Değildir.");
        }
    }
}