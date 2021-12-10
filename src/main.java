import java.util.Scanner;

public class main{

    // Yarıçapı verilen bir dairenin çevresini ve alanını hesaplama.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double pi = 3.14, cevre , alan;

        System.out.println("Dairenin yarıçapını giriniz:");
        r = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Dairenin çevresi :" +cevre);
        System.out.println("Dairenin alanı  :" +alan );

    }
}
