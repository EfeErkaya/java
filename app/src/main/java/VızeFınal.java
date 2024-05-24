import java.util.Scanner;

public class VızeFınal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vize Notu Giriniz: ");
        int vize = input.nextInt();
        System.out.print("Final Notu Giriniz: ");
        int finalNotu = input.nextInt();

        double ortalama = (vize * 0.4) + (finalNotu * 0.6);
        if (ortalama >= 50) {
            System.out.println("Tebrikler, Geçtiniz!");
        } else {
            System.out.println("Maalesef, Kaldınız!");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}
