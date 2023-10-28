package com.soal.no2;

import java.text.DecimalFormat;
import java.util.Scanner;

class Karung {
    Scanner s = new Scanner(System.in);

    final int priceXL = 100_000_000;
    final int priceL = 75_000_000;
    final int priceM = 50_000_000;
    final double interest = 0.025;

    int customerSize;
    int customerInterestRate;
    double finalPrice;
    double monthlyObligations;

    double sumData;
    int customerMonthlyLoan;
    String customerSizeType;

    void getCustomerInfo() {
        System.out.println("Silahkan Masukan Data Anda");
        System.out.print("Masukan Nama Peminjam : ");
        String name = s.nextLine();
        System.out.println();
        System.out.print("Masukan No.KTP Peminjam : ");
        String ktp = s.nextLine();
        System.out.println();

        System.out.println("Pilih Ukuran Karung");
        System.out.println("1. XL");
        System.out.println("2. L");
        System.out.println("3. M");
        System.out.print("Masukan Pilihan : ");
        int size = s.nextInt();

        System.out.print("Berapa Lama Pinjam (Bulan) : ");
        int customerLoanMonths = s.nextInt();
        System.out.println();

        if (size == 1) {
            customerSize = priceXL;
            customerSizeType = "XL";
        } else if (size == 2) {
            customerSize = priceL;
            customerSizeType = "L";
        } else if (size == 3) {
            customerSize = priceM;
            customerSizeType = "M";
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        calculateLoanDetails(name, customerLoanMonths);
    }

    void calculateLoanDetails(String name, int customerLoanMonths) {
        double interestAmount = customerSize * interest;
        monthlyObligations = (customerSize + interestAmount) / customerLoanMonths;

        double totalLoan = customerSize + interestAmount;

        displayResults(name, interestAmount, totalLoan);
    }

    void displayResults(String name, double interestAmount, double totalLoan) {
        DecimalFormat formatter = new DecimalFormat("#,###");

        System.out.println("Anda Memilih Paket " + customerSizeType);
        System.out.println("Dengan Pinjam Rp. " + formatter.format(customerSize));
        System.out.println("Dengan Bunga Rp. " + formatter.format(interestAmount));
        System.out.println();
        System.out.println("Total Kewajiban Pinjaman");
        System.out.println();
        System.out.println("Kewajiban Bulanan Rp. " + formatter.format(monthlyObligations));
        System.out.println("Total Pinjaman : Rp. " + formatter.format(totalLoan));
        System.out.println();
        System.out.println(
                "Terimakasih sudah meminjam di THE SOLUTION OF MONEY pusing dengan keuangan... Kami solusinya (*_*)");
    }
}
