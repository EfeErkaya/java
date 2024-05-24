import java.util.Scanner;
public class WhileDongusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayı1 = input.nextInt();
        int faktoriyel = 1;
        int i = 1;
        while (i <=sayı1) {
            faktoriyel *= i;
            i++;

        }
        System.out.println("Sayının faktoriyeli: " + faktoriyel);



        }

    }

