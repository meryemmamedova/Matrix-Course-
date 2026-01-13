package Lessons;

import java.util.Scanner;

public class Third {
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Tapsiriq 1.

        System.out.print("Ceki:");
        float weightKg = sc.nextFloat();
        System.out.print("Boy:");
        int heightCm = sc.nextInt();
        double heightM = (double) heightCm / 100.0;
        double bmi = weightKg / Math.pow(heightM , 2);
        System.out.println("BMI: " + bmi);


        if ( bmi < 18.5 ) {
            System.out.println("(Zeif cekili)");
        }    else if (18.5 <= bmi  && bmi < 24.9) {
            System.out.println("(Normal)");
        }    else if (25.0 <= bmi && bmi < 29.9) {
            System.out.println("(Artiq cekili)");
        }    else {
            System.out.println("(Obez)");
        }

        //Tapsiriq 2.

        int qiymet = sc.nextInt();

        if ( qiymet < 0 || qiymet > 100) {
           System.out.println("Xeta");
        } else if(qiymet >= 90) {
            System.out.print("Sizin qiymetiniz: A");
        } else if (qiymet >= 80) {
            System.out.print("Sizin qiymetiniz: B");
        } else if (qiymet >= 70) {
            System.out.print("Sizin qiymetiniz: C");
        } else if (qiymet >= 60) {
            System.out.print("Sizin qiymetiniz: D");
        } else {
            System.out.print("F");
        }

        //Tapsiriq 3.

        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        boolean ucbucaqdir = a + b > c && a + c > b && b + c > a;

        if ( !ucbucaqdir ) {
            System.out.println("Xeta");
        } else if (a == b && a == c) {
            System.out.println("Beraberterefli");
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("Beraberyanli");
        } else
            System.out.println("Muxtelifterefli");
        }
    }
