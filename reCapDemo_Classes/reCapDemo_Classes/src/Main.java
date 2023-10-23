public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(1,2,3,4,5,6);
        int sonuc = dortIslem.cikar(10,5);
        int bolumsonuc = dortIslem.bol(10,5);
        int carpim = dortIslem.carp(1,1,1,6,5);
        System.out.println(toplam);
        System.out.println(sonuc);
        System.out.println(bolumsonuc);
        System.out.println(carpim);
    }
}