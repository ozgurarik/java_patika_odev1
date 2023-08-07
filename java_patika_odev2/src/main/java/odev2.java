import java.util.Scanner;
public class odev2 {
    public static void main (String[] args) {
        double a, b, c, d=0.18;

        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen bir tutar giriniz?");
        a= input.nextDouble();
        b= a+a*d;
        c= a*d;

        System.out.println("kdv eklenmiş tutar:" +b);
        System.out.println("kdv tutarı:" +c);
        System.out.println("kdv oranı:" +d);

    }
}
