package YouTubeFreeTemelJava;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yarıçap Giriniz: ");

        double yariCap = scan.nextDouble();

        double alan = 3.14 * yariCap * yariCap;

        System.out.println("Dairenin Alanı : " + alan);
    }
}
