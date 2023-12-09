package YouTubeFreeTemelJava;

import java.util.Scanner;

public class Kaldimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu Giriniz : ");
        double not1 = scan.nextDouble();

        if (not1 >= 50){
            System.out.println("Tebrikler...");
        } else {
            System.out.println("Kaldınız!");
        }
    }
}
