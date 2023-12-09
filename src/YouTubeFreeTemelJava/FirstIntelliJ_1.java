package YouTubeFreeTemelJava;

import java.util.Scanner;

public class FirstIntelliJ_1 {
    public static void main(String[] args) {

        System.out.println("QA Denemelerine hoşgeldiniz..!!");
        System.out.println("Genel Kapsam olarak neler oalcağına bakacağız.");
        System.out.println("Youtube Free Java Course devam edelim.");

        int int1 = 5;
        boolean oneZer0 = true;
        double ondalik = 10.9;
        char karakter = 'A';
        String str1 = "Ahmet";

        System.out.println("------------------------------");
        //char tek tırnak ile String " çift tırnak ile kullanılır.
        //int boolean double char Primitive Datadır. String ise NonPrimitive dir ve büyük harfle başlar.


        System.out.println(int1);
        System.out.println(oneZer0);
        System.out.println(ondalik);
        System.out.println(karakter);
        System.out.println(str1);

        Scanner scan = new Scanner(System.in);

        System.out.print("İsim Giriniz..: ");
        String isim1 = scan.nextLine();

        System.out.print("Meslek Bilgisi Giriniz  : ");
        String meslek1 = scan.nextLine();

        System.out.println(isim1);
        System.out.println(meslek1);
    }
}
