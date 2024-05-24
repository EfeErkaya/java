import java .util.Scanner;
public class faktoryel1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int faktoryel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoryel = faktoryel * i;
        }

            System.out.println(faktoryel);




    }
}
