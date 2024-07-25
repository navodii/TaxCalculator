/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.senuri.coursework6;

import java.util.Scanner;

/**
 *
 * @author User1
 */
public class CourseWork6 {

    public static void main(String[] args) {
        Print();
        WithholdingTax();
        RentTax();
        BankInterestTax();
        DividendTax();
        PayableTax();
        IncomeTax();
        SSCLTax();
        LeasingPayment();
        CalculateLeasingPayment();
        SearchLeasingCategory();
        FindLeasingAmount();

    }

    public static int Print(int answer) {
        Scanner sc = new Scanner(System.in);

        System.out.println("                                              __  ______  ________ ________       ");
        System.out.println("                                              |  \\/      \\|        |        \\  ");
        System.out.println("                                              \\$|  $$$$$$| $$$$$$$$\\$$$$$$$$    ");
        System.out.println("                                              | $| $$     | $$  \\      |$$       ");
        System.out.println("                                              | $| $$     | $$$$$      |$$        ");
        System.out.println("                                              | $| $$     | $$_____    |$$        ");
        System.out.println("                                              | $$\\$$    $| $$     \\   |$$      ");
        System.out.println("                                               \\$$ \\$$$$$$ \\$$$$$$$$   \\$$    ");

        System.out.println(" _______             __   __   _____              _         _____   _    _   _                   _______    ____    _____                  ");
        System.out.println("|__   __|     /\\     \\ \\ / /  / ____|     /\\     | |       / ____| | |  | | | |          /\\     |__   __|  / __ \\  |  __ \\          ");
        System.out.println("   | |       /  \\     \\ V /  | |         /  \\    | |      | |      | |  | | | |         /  \\       | |    | |  | | | |__) |            ");
        System.out.println("   | |      / /\\ \\     > <   | |        / /\\ \\   | |      | |      | |  | | | |        / /\\ \\      | |    | |  | | |  _  /           ");
        System.out.println("   | |     / ____ \\   / . \\  | |____   / ____ \\  | |____  | |____  | |__| | | |____   / ____ \\     | |    | |__| | | | \\ \\           ");
        System.out.println("   |_|    /_/    \\_\\ /_/ \\_\\  \\_____| /_/    \\_\\ |______|  \\_____|  \\____/  |______| /_/    \\_\\    |_|     \\____/  |_|  \\_\\  ");

        System.out.println("================================================================================================================================================");
        System.out.println("[1] Withholding Tax");
        System.out.println("[2] Payable Tax");
        System.out.println("[3] Income Tax");
        System.out.println("[4] Social Security Contribution Levy (SSCL) Tax");
        System.out.println("[5] Leasing Payment");
        System.out.println("[6] Exit");
        System.out.println(" ");

        System.out.print("Enter an option to continue -> ");
        answer = sc.nextInt();
        return Print;
    }

    int tax = sc.nextInt();
    switch (tax) {
        case 1:
     
    public static int WithholdingTax(int answer){
                     Scanner sc = new Scanner(System.in);
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                    WITHHOLDING TAX                      |");
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println(" ");
                    System.out.println("    [1] Rent Tax");
                    System.out.println("    [2] Bank Interest Tax");
                    System.out.println("    [3] Divident Tax");
                    System.out.println("    [4] Exit");
                    System.out.println(" ");

                    System.out.print("Enter an option to continue -> ");
                    answer = sc.nextInt();
                    return WithholdingTax;
            }
                    int tax1 = sc.nextInt();
    switch (tax1) {

        case 1:
     
    public static int RentTax(){
                     Scanner sc = new Scanner(System.in);
                            
                            String value;
                            do {
                                System.out.println("+---------------------------------------------------------+");
                                System.out.println("|                     RENT TAX                            |");
                                System.out.println("+---------------------------------------------------------+");
                                System.out.println(" ");

                                System.out.print("Enter your rent          : ");
                                double rent = sc.nextDouble();

                                if (rent < 0) {

                                    System.out.println("Invalid Input...");
                                    System.out.println("  ");
                                    System.out.print("Do you want to enter the correct value again (Y/N) : ");
                                    value = sc.next();

                                } else if (rent

    
        >= 100000) {
                                    double rentTax = (rent - 100000) * 10 / 100;
        System.out.println("You have to pay Rent Tax : " + rentTax);
        System.out.println("  ");
        System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
        value = sc.next();

    }

    
        else {
                                    System.out.println("      you dont have to pay rent tax...");
        System.out.println("  ");
        System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
        value = sc.next();

    }

}
while (value.equals("Y") || value.equals("y"));

                            return RentTax;
}

                        case 2:
                     public static int BankInterestTax(){
                     Scanner sc = new Scanner(System.in);

                            String value1;
                            do {
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println("|                   BANK INTEREST TAX                       |");
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println(" ");

                                System.out.print("Enter your bank interest per year          : ");
                                double interestTax = sc.nextDouble();
                                double interest = interestTax * 5 / 100;
                                System.out.println("You have to pay Bank Interest Tax per year : " + interest);
                                System.out.println("  ");
                                System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
                                value1 = sc.next();

                            } while (value1.equals("Y") || value1.equals("y"));

                            return BankInterestTax;
}

                        case 3:
                     public static int DividendTax(){
                     Scanner sc = new Scanner(System.in);

                            String value2;
                            do {
                                System.out.println("+---------------------------------------------------------+");
                                System.out.println("|                     DIVIDEND TAX                        |");
                                System.out.println("+---------------------------------------------------------+");
                                System.out.println(" ");

                                System.out.print("Enter your total divident per year   : ");
                                double divident = sc.nextDouble();

                                if (divident > 100000) {
                                    double dividentTax = (divident - 100000) * 14 / 100;
                                    System.out.println("You have to pay Divident per year    : " + dividentTax);
                                } else {
                                    System.out.println("      you dont have to pay Divident Tax...");
                                }
                                System.out.println("  ");
                                System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
                                value2 = sc.next();

                            } while (value2.equals("Y") || value2.equals("y"));

                            return DividendTax;
}

                        default:
                            System.out.println("  Your option is incorrect...");
                            break;

                        case 4:
                            System.out.println("------COME AGAIN------");
                            break;

                    }
                    break;

                case 2:
                     public static int PayableTax(){
                     Scanner sc = new Scanner(System.in);


                    String value3;
                    do {
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("|                     PAYABLE TAX                         |");
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println(" ");

                        System.out.print("Enter your employee payment per month      : ");
                        double payment = sc.nextDouble();

                        if (payment <= 100000) {
                            System.out.println("      You don't have to pay Payable Tax...");

                        } else if (payment <= 141667) {
                            double payable = (payment - 100000) * 6 / 100;
                            System.out.println("You have to pay payable Tax per month      : " + payable);

                        } else if (payment <= 183333) {
                            double payable = (payment - 141667) * 12 / 100 + 2500;
                            System.out.println("You have to pay payable Tax per month      : " + payable);

                        } else if (payment <= 225000) {
                            double payable = (payment - 183333) * 18 / 100 + 7500;
                            System.out.println("You have to pay payable Tax per month      : " + payable);

                        } else if (payment <= 266667) {
                            double payable = (payment - 225000) * 24 / 100 + 15000;
                            System.out.println("You have to pay payable Tax per month      : " + payable);

                        } else if (payment <= 308333) {
                            double payable = (payment - 266666) * 30 / 100 + 25000;
                            System.out.println("You have to pay payable Tax per month      : " + payable);

                        } else {
                            double payable = (payment - 308333) * 36 / 100 + 37500;
                            System.out.println("You have to pay payable Tax per month      : " + payable);
                        }
                        System.out.println("  ");
                        System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
                        value3 = sc.next();

                    } while (value3.equals("Y") || value3.equals("y"));

                    return PayableTax;
}

                case 3:
                     public static int IncomeTax(){
                     Scanner sc = new Scanner(System.in);

                    String value4;
                    do {
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("|                      INCOME TAX                         |");
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println(" ");

                        System.out.print("Enter your total income per year      : ");
                        double income = sc.nextDouble();

                        if (income <= 1200000) {
                            System.out.println("      You don't have to Income Tax...");

                        } else if (income <= 1700000) {
                            double total = (income - 1200000) * 6 / 100;
                            System.out.println("You have to pay payable Tax per month : " + total);

                        } else if (income <= 2200000) {
                            double total = (income - 1700000) * 12 / 100 + 30000;
                            System.out.println("You have to pay payable Tax per month : " + total);

                        } else if (income <= 2700000) {
                            double total = (income - 2200000) * 18 / 100 + 90000;
                            System.out.println("You have to pay payable Tax per month : " + total);

                        } else if (income <= 3200000) {
                            double total = (income - 2700000) * 24 / 100 + 180000;
                            System.out.println("You have to pay payable Tax per month : " + total);

                        } else if (income <= 3700000) {
                            double total = (income - 3200000) * 30 / 100 + 300000;
                            System.out.println("You have to pay payable Tax per month : " + total);

                        } else {
                            double total = (income - 3700000) * 36 / 100 + 450000;
                            System.out.println("You have to pay payable Tax per month : " + total);
                        }
                        System.out.println("  ");
                        System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
                        value4 = sc.next();

                    } while (value4.equals("Y") || value4.equals("y"));

                   return IncomeTax;
}

                case 4:
                    public static int SSCLTax(){
                     Scanner sc = new Scanner(System.in);

                    String value5;
                    do {
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println("|      SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX       |");
                        System.out.println("+---------------------------------------------------------+");
                        System.out.println(" ");

                        System.out.print("Enter value of good or Service      : ");
                        double value = sc.nextDouble();

                        double taxValue = (value) * 2.5 / 100;
                        double taxTotal = taxValue + value;
                        double VATValue = (taxTotal) * 15 / 100;
                        double totalValue = taxValue + VATValue;
                        System.out.println("You have to pay SSCLTax             : " + totalValue);

                        System.out.println("  ");
                        System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
                        value5 = sc.next();

                    } while (value5.equals("Y") || value5.equals("y"));

                   return  SSCLTax;
}

                case 5:
                     public static int LeasingPayment(int answer){
                     Scanner sc = new Scanner(System.in);

                    System.out.println("+---------------------------------------------------------+");
                    System.out.println("|                    Leasing Payment                      |");
                    System.out.println("+---------------------------------------------------------+");
                    System.out.println(" ");
                    System.out.println("    [1] Calculate Monthly Installment");
                    System.out.println("    [2] Search Leasing Category");
                    System.out.println("    [3] Find Leasing Amount");
                    System.out.println("    [4] Exit");
                    System.out.println(" ");

                    System.out.print("Enter an option to continue -> ");
                    answer=sc.nextInt();
                   return LeasingPayment;
}
                    int lease = sc.nextInt();
                    switch (lease) {
                        case 1:
                           public static int CalculateLeasingPayment(){
                           Scanner sc = new Scanner(System.in);

                            String value6;
                            do {
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println("|                Calculate Leasing Payment                  |");
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println(" ");

                                System.out.print("Enter lease amount         : ");
                                double leaseAmount = sc.nextDouble();

                                if (leaseAmount < 0) {
                                    System.out.println("Invalid Lease Amount");
                                } else {
                                    System.out.print("Enter annual interest rate : ");
                                    double annualRate = sc.nextDouble();

                                    System.out.print("Enter number of year       : ");
                                    double numberOfYear = sc.nextDouble();

                                    if (numberOfYear > 5) {
                                        System.out.println("   Invalid number of year...Enter the correct value again...");
                                        System.out.print("Enter number of year       : ");
                                        double numberOfYear1 = sc.nextDouble();

                                        double A = annualRate / 1200;
                                        double B = 1 + A;
                                        double C = numberOfYear1 * 12;
                                        double D = leaseAmount;
                                        double E = Math.pow(B, C);
                                        double F = 1 / E;
                                        double monthlyInstallment = D * A / (1 - F);
                                        System.out.println("Your monthly installment   : " + monthlyInstallment);
                                    } else {

                                        double A = annualRate / 1200;
                                        double B = 1 + A;
                                        double C = numberOfYear * 12;
                                        double D = leaseAmount;
                                        double E = Math.pow(B, C);
                                        double F = 1 / E;
                                        double monthlyInstallment = D * A / (1 - F);
                                        System.out.println("Your monthly installment  : " + monthlyInstallment);
                                    }
                                }
                                System.out.println("  ");
                                System.out.print("Do you want to calculate another monthly installment (Y/N) : ");
                                value6 = sc.next();

                            } while (value6.equals("Y") || value6.equals("y"));

                           return CalculateLeasingPayment;
}

                        case 2:
                          public static int SearchLeasingCategory(){
                           Scanner sc = new Scanner(System.in);


                            String value7;
                            do {
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println("|                 Search Leasing Category                   |");
                                System.out.println("+-----------------------------------------------------------+");
                                System.out.println(" ");

                                System.out.print("Enter lease amount         : ");
                                double leaseAmount1 = sc.nextDouble();
                                if (leaseAmount1 < 0) {
                                    System.out.println("Invalid Lease Amount");
                                } else {
                                    System.out.print("Enter annual interest rate : ");
                                    double annualRate1 = sc.nextDouble();

                                    double G = annualRate1 / 1200;
                                    double H = 1 + G;
                                    double I = 3 * 12;
                                    double J = leaseAmount1;
                                    double K = Math.pow(H, I);
                                    double L = 1 / K;
                                    double leasingPlan1 = J * G / (1 - L);
                                    System.out.println("Your monthly instalment for 3 year leasing plan  : " + leasingPlan1);

                                    double a = annualRate1 / 1200;
                                    double b = 1 + a;
                                    double c = 4 * 12;
                                    double d = leaseAmount1;
                                    double e = Math.pow(b, c);
                                    double f = 1 / e;
                                    double leasingPlan2 = d * a / (1 - f);
                                    System.out.println("Your monthly instalment for 4 year leasing plan  : " + leasingPlan2);

                                    double g = annualRate1 / 1200;
                                    double h = 1 + g;
                                    double i = 5 * 12;
                                    double j = leaseAmount1;
                                    double k = Math.pow(h, i);
                                    double l = 1 / k;
                                    double leasingPlan3 = j * g / (1 - l);
                                    System.out.println("Your monthly instalment for 5 year leasing plan  : " + leasingPlan3);
                                }
                                System.out.println("  ");
                                System.out.print("Do you want to search another Leasing Category (Y/N) : ");
                                value7 = sc.next();

                            } while (value7.equals("Y") || value7.equals("y"));
                            return SearchLeasingCategory;
}

                        case 3:

                           public static int FindLeasingAmount(){
                           Scanner sc = new Scanner(System.in);
                            System.out.println("+-----------------------------------------------------------+");
                            System.out.println("|                 Find Leasing Amount                       |");
                            System.out.println("+-----------------------------------------------------------+");
                            System.out.println(" ");
                            String value8;
                            do {
                                System.out.print("Enter the monthly lease payment amount you can afford  : ");
                                double leasePayment = sc.nextDouble();
                                if (leasePayment < 0) {
                                    System.out.println("Invalid Lease Amount");
                                } else {

                                    System.out.print("Enter number of year                                   : ");
                                    double years = sc.nextDouble();
                                    System.out.print("Enter annual interest rate                             : ");
                                    double interestRate = sc.nextDouble();

                                    double M = interestRate / 1200;
                                    double N = 1 + M;
                                    double O = years * 12;
                                    double P = leasePayment;
                                    double Q = Math.pow(N, O);
                                    double R = 1 / Q;
                                    double leaseamount = P / (M / (1 - R));
                                    System.out.println("Your monthly installment                               : " + leaseamount);
                                }
                                System.out.println("  ");
                                System.out.print("Do you want to calculate another monthly installment (Y/N) : ");
                                value8 = sc.next();

                            } while (value8.equals("Y") || value8.equals("y"));
                            return FindLeasingAmount;
}

                        default:
                            System.out.println("  Your option is incorrect...");
                            break;

                        case 4:
                            System.out.println("---------------COME AGAIN---------------");
                            break;
                    
                    }
                    break;
                default:
                    System.out.println("  Your option is incorrect...");
                    break;

                case 6:
                    System.out.println("-------COME AGAIN-------");
                    break;

            }
        }
