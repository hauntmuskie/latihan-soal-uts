package com.soal.no1;

import java.util.Scanner;

public class Penyewaan {
    Scanner s = new Scanner(System.in);

    final int riasWajahBiasa = 100_000;
    final int riasMakeUpArtis = 250_000;

    final int bajuPengantinAdat = 150_000;
    final int bajuPengantinInternasional = 350_000;

    final int aksesorisAnak = 20_000;
    final int aksesorisDewasa = 50_000;

    int riasPrice;
    int bajuPengantinPrice;
    int aksesorisPrice;
    int finalPrice = 0;
    int customerCount;

    void showRiasMenu() {
        System.out.println();
        System.out.println("Jenis Rias");
        System.out.println("1. Rias Wajah (Biasa/MUA)");
        System.out.println("2. Rias Pengantin (Adat/International)");
        System.out.println("3. Aksesoris (Anak/Dewasa)");
        System.out.println();
        System.out.print("Pilihan Anda : ");
        int userChoice = s.nextInt();

        // Rias Wajah
        if (userChoice == 1) {
            System.out.println();
            System.out.println("Rias Wajah:");
            System.out.println("1. Rias Wajah Biasa Rp. 100.000");
            System.out.println("2. Rias Wajah (Make Up Artis) Rp. 250.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            int riasType = s.nextInt();
            System.out.print("Berapa Jam: ");
            customerCount = s.nextInt();

            if (riasType == 1) {
                calcRiasPrice(customerCount, riasWajahBiasa);
            }

            if (riasType == 2) {
                calcRiasPrice(customerCount, riasMakeUpArtis);
            }
            System.out.println("Data Tersimpan");

        }

        // Rias Pengantin
        if (userChoice == 2) {
            System.out.println();
            System.out.println("Rias Pengantin:");
            System.out.println("1. Baju Pengantin Adat Rp. 150.000");
            System.out.println("2. Baju Pengantin Internasional Rp. 200.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            int bajuType = s.nextInt();
            System.out.print("Berapa Jam : ");
            customerCount = s.nextInt();

            if (bajuType == 1) {
                calcBajuPengantinPrice(customerCount, bajuPengantinAdat);
            }

            if (bajuType == 2) {
                calcBajuPengantinPrice(customerCount, bajuPengantinInternasional);
            }
            System.out.println("Data Tersimpan");

        }

        // Aksesoris
        if (userChoice == 3) {
            System.out.println();
            System.out.println("Aksesoris:");
            System.out.println("1. Aksesoris Anak Rp. 350.000");
            System.out.println("2. Aksesoris Dewasa Rp. 50.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            int aksesorisType = s.nextInt();
            System.out.print("Berapa Jam : ");
            customerCount = s.nextInt();

            if (aksesorisType == 1) {
                calcAksesorisPrice(customerCount, aksesorisAnak);
            }

            if (aksesorisType == 2) {
                calcAksesorisPrice(customerCount, aksesorisDewasa);
            }
            System.out.println("Data Tersimpan");

        }
    }

    public int calcRiasPrice(int customerCount, int riasPrice) {
        return finalPrice = customerCount * riasPrice;
    }

    public int calcBajuPengantinPrice(int customerCount, int bajuPengantinPrice) {
        return finalPrice = customerCount * bajuPengantinPrice;
    }

    public int calcAksesorisPrice(int customerCount, int aksesorisPrice) {
        return finalPrice = customerCount * aksesorisPrice;
    }

    public int getFinalPrice() {
        return finalPrice;
    }
}
