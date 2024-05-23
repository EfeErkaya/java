import java.sql.SQLOutput;

public class DenemeChar {
    public static void main(String[] args) {
        char karakter = 'E';
        System.out.println("Karakter: "+karakter);
        karakter= 'E' + 1;
        System.out.println("Karakter: "+karakter);
        karakter = (char)(karakter - 1);
        System.out.println("Karakter: "+karakter);


    }

}
