public class forDongusu100 {
    public static void main(String[] args) {
        // sayi1'i bir int olarak tanımlıyoruz
        int sayi1 = 1;

        // Döngüyü 1'den başlayarak 100'e kadar çalıştırıyoruz
        for (int i = 0; i < 100; i++, sayi1++) {
            if (sayi1 % 3 == 0) {
                System.out.println(sayi1);
            }
        }
    }
}
