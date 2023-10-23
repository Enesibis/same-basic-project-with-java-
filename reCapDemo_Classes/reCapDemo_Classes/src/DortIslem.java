public class DortIslem {
    public int topla(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar){
            toplam += sayi;
        }
        return toplam;
    }
    public int cikar(int sayi1, int sayi2){
        return sayi1-sayi2;
    }
    public int carp(int... sayilar){
        int carpim = 1;
        for (int sayi : sayilar){
            carpim *= sayi;
        }
        return carpim;
    }
    public int bol(int sayi1, int sayi2){
        return sayi1 / sayi2;
    }
}
