import java.util.Scanner;
public class bırDenBaslayarakToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int toplam = 0; toplam < 10;
        ) {
            { System.out.println("bir sayı giriniz");
                int sayi = input.nextInt();
                toplam += sayi;
                System.out.println("toplam = " + toplam);



            }


        }
    }
}
