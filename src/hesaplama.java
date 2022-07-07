import java.util.Scanner;
public class hesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;
        double  cevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.print("1.kenar  :");
         a = input.nextInt();


        System.out.print("2.kenar  :");
        b = input.nextInt();


        c = Math.sqrt((a*a) + (b*b));
        cevre = a + b + c;
        alan  = a * b / 2.0;
        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);
        System.out.println("Hipotenus :" +c);

    }
}
