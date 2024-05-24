import java.util.Scanner;
public class SayılarınToplamı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=input.nextInt();
        int toplam=0;
        for(int i=1;i<=sayi;i++){
            toplam=toplam+i;

        }
        System.out.println(toplam);

    }
}
