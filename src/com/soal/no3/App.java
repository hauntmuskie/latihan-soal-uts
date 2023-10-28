package com.soal.no3;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pasien pasien = new Pasien();
        pasien.inputDataPasien();

        System.out.println();
        System.out.println("*Nama Poli*");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
        System.out.println();
        System.out.print("Pilih Poli : ");
        int pilihanPoli = scanner.nextInt();
        String namaPoli = "";
        switch (pilihanPoli) {
            case 1:
                namaPoli = "Gigi";
                break;
            case 2:
                namaPoli = "Anak";
                break;
            case 3:
                namaPoli = "Umum";
                break;
        }

        System.out.println();
        System.out.println("*Nama Dokter*");
        System.out.println("1. drg Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfia Putri");
        System.out.println();
        System.out.print("Pilih Dokter : ");
        int pilihanDokter = scanner.nextInt();
        scanner.nextLine();

        String namaDokter = "";
        switch (pilihanDokter) {
            case 1:
                namaDokter = "drg Ahmad Afandi";
                break;
            case 2:
                namaDokter = "dr. Aris Wicaksono, Sp.A.";
                break;
            case 3:
                namaDokter = "dr. Alfia Putri";
                break;
        }

        System.out.println();
        System.out.print("Berikan Keterangan Dokter : ");
        String keterangan = scanner.nextLine();

        System.out.print("\nMasukkan biaya pendaftaran: ");
        int biayaPendaftaran = scanner.nextInt();
        System.out.print("Masukkan biaya obat: ");
        int biayaObat = scanner.nextInt();
        System.out.print("Masukkan biaya vitamin: ");
        int biayaVitamin = scanner.nextInt();
        System.out.print("Masukkan biaya dokter: ");
        int biayaDokter = scanner.nextInt();

        Transaksi transaksi = new Transaksi(biayaPendaftaran, biayaObat, biayaVitamin, biayaDokter);

        System.out.println();

        System.out.println("Poli: " + namaPoli);
        System.out.println("Dokter: " + namaDokter);
        System.out.println("Keterangan : " + keterangan);
        System.out.println();
        System.out.println("Total Biaya yang dibayar Pasien Rp. " + transaksi.hitungTotalBiaya());
        System.out.println();
        System.out.println("Salam Sehat " + pasien.nama + " dari Rumah Sakit Waras");
    }
}
