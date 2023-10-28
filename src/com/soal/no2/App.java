package com.soal.no2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        displayMenu();
    }

    static void displayMenu() {
        Scanner s = new Scanner(System.in);
        Karung karung = new Karung();
        PaperBag paperBag = new PaperBag();

        System.out.println("Silahkan Pilih Paket Pinjaman : ");
        System.out.println("1. PAKET KARUNG");
        System.out.println("2. PAKET PAPER BAG");
        System.out.println();
        System.out.print("Masukan Pilihan Paket : ");
        int menuChoice = s.nextInt();
        System.out.println();

        if (menuChoice == 1) {
            karung.getCustomerInfo();
        }

        if (menuChoice == 2) {
            paperBag.getCustomerInfo();;
        }
    }
}