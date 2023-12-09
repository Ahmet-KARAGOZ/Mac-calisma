package YouTubeFreeTemelJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C032_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");

        String isim = scan.nextLine();

        System.out.print("Soyadınızı Giriniz : ");

        String soyAd = scan.nextLine();

        System.out.print("Yaş bilgisi giriniz : ");

        int yas = scan.nextInt();

        System.out.println(isim.charAt(0)+"."+soyAd+" "+yas);
    }
}
