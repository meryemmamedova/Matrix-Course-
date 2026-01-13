package Lessons;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menyu secimi et: ");
        System.out.println("1. Valyuta cevirici");
        System.out.println("2. BMI (Body Mass Index)");
        System.out.println("3. Vergi hesablayici");
        System.out.println("4. Qiymet / Grade kalkulyatoru");
        System.out.println("5. Taksi haqqi hesablayici");
        System.out.println("6. Ucbucaq novu teyin etme");

        int menyu = sc.nextInt();
        switch (menyu) {
            case 1:
                System.out.println("Meblegi daxil et: ");
                double amount = sc.nextDouble();
                System.out.println("From:  ");
                String from = sc.next();
                System.out.println("TO: ");
                String to = sc.next();

                if (from.equals("AZN") && to.equals("USD")) {
                    double result = amount * 0.59;
                    System.out.println(amount + " AZN = " + result + " USD");
                } else if (from.equals("AZN") && to.equals("EUR")) {
                    double result = amount * 0.54;
                    System.out.println(amount + " AZN = " + result + " EUR");
                } else if (from.equals("USD") && to.equals("AZN")) {
                    double result = amount * 1.70;
                    System.out.println(amount + " USD = " + result + " AZN");
                } else if (from.equals("EUR") && to.equals("AZN")) {
                    double result = amount * 1.85;
                    System.out.println(amount + " EUR = " + result + " AZN");
                } else {
                    System.out.println("Xeta");
                }
                break;
            case 2:
                System.out.print("Ceki:");
                float weightKg = sc.nextFloat();
                System.out.print("Boy:");
                int heightCm = sc.nextInt();
                double heightM = (double) heightCm / 100.0;
                double bmi = weightKg / Math.pow(heightM, 2);
                System.out.println("BMI: " + bmi);


                if (bmi < 18.5) {
                    System.out.println("(Zeif cekili)");
                } else if (18.5 <= bmi && bmi < 24.9) {
                    System.out.println("(Normal)");
                } else if (25.0 <= bmi && bmi < 29.9) {
                    System.out.println("(Artiq cekili)");
                } else {
                    System.out.println("(Obez)");
                }
                break;
            case 3:

                double monthlySalary = sc.nextDouble();
                boolean isResident = sc.nextBoolean();

                double tax = 0;

                if (isResident) {
                } if (monthlySalary < 500) {
                    tax = 0;
                } else if (monthlySalary < 2000) {
                    tax = (monthlySalary - 500) * 0.1;
                } else if (monthlySalary > 2000) {
                    tax = (monthlySalary - 2000) * 0.15;
                    tax += 150;
                }
                else {
                    tax *= monthlySalary * 0.2;
                }

                System.out.println("net: " +  (monthlySalary - tax) + " , tax: " + tax);
                break;
            case 4:
                int qiymet = sc.nextInt();

                if ( qiymet < 0 || qiymet > 100) {
                    System.out.print("Xeta");
                } else if(qiymet >= 90) {
                    System.out.print("Sizin qiymetiniz: A");
                } else if (qiymet >= 80) {
                    System.out.print("Sizin qiymetiniz: B");
                } else if (qiymet >= 70) {
                    System.out.print("Sizin qiymetiniz: C");
                } else if (qiymet >= 60) {
                    System.out.print("Sizin qiymetiniz: D");
                } else {
                    System.out.print("Sizin qiymetiniz: F");
                }
                break;
            case 5:
                double distanceKM = sc.nextDouble();
                boolean isNight = sc.nextBoolean();
                byte age = sc.nextByte();

                double tarif = 1.00;
                tarif += distanceKM * 0.70;

                if (isNight) {
                    tarif += distanceKM * 0.10;
                }

                if (age < 12) {
                    tarif = tarif * 0.5;
                } else if (age >= 65) {
                    tarif = tarif * 0.7;
                }
                System.out.println("Taksi haqqi: " + tarif + " AZN");
                break;
            case 6:
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
                break;

                default:
                System.out.println("Secim yoxdur");
        }


         }

    }




