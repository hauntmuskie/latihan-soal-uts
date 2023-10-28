package com.soal.no3;

import java.util.Scanner;

public class Pasien {
    String nama;
    String alamat;
    String noTelp;

    void inputDataPasien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*Masukan Data Pasien*");
        System.out.print("Masukan Nama : ");
        nama = scanner.nextLine();
        System.out.print("Masukan Alamat: ");
        alamat = scanner.nextLine();
        System.out.print("Masukan No.Telepon: ");
        noTelp = scanner.nextLine();
    }
}