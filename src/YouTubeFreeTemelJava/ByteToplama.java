package YouTubeFreeTemelJava;

import java.util.Scanner;

public class ByteToplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir deger giriniz : ");
        char girilenDeger = scan.next().charAt(0);


        System.out.println("Girilen degerden bir sonrası : " + (char)(girilenDeger+1));
        System.out.println("Girilen degerden iki sonrası : " + (char)(girilenDeger+2));
        System.out.println("Girilen degerden üç sonrası : " + (char)(girilenDeger+3));



    }
}
