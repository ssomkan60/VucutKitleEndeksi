import java.util.Scanner;
public class VucutKitleEndeksiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz:");
        double boy = input.nextDouble();

        System.out.print("Kilonuzu Giriniz:");
        double kilo = input.nextDouble();

        double kitleEndeksi = kilo / (boy*boy) ;
        System.out.println("Vücut Kitle Endeksiniz:" + kitleEndeksi);
    }
}
