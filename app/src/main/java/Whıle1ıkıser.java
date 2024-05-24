import java.util.Scanner;

public class Whıle1ıkıser{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1 = input.nextInt();;

        while (sayi1 >= 1) {
            sayi1 -=2;
            System.out.println("Adım " + sayi1 + ": " + sayi1);
        }
    }
}
