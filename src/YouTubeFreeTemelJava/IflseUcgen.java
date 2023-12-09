package YouTubeFreeTemelJava;

import java.util.Scanner;

public class IflseUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Kenar uzunluğu : ");
        int kenar1 = scan.nextInt();

        System.out.println("2. Kenar uzunluğu : ");
        int kenar2 = scan.nextInt();

        System.out.println("3. Kenar uzunluğu : ");
        int kenar3 = scan.nextInt();

        if (kenar1 == kenar2){
            System.out.println("Bu İkizkenar bir üçgendir");
        }
        else if (kenar1 == kenar3){
            System.out.println("İkizkenar üçgendir.");
        } else if (kenar2 == kenar3) {
            System.out.println("ikizkenardır.");
        } else {
            System.out.println("İkizkenar değildir.");
        }


        if (kenar1==kenar2 || kenar1==kenar3 || kenar3==kenar2){
            System.out.println("İkizkenardır");
        } else {
            System.out.println("İkizkena değildir");
        }

    }
}
