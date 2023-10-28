package com.soal.no3;

public class Transaksi {
    int biayaPendaftaran;
    int biayaObat;
    int biayaVitamin;
    int biayaDokter;

    Transaksi(int biayaPendaftaran, int biayaObat, int biayaVitamin, int biayaDokter) {
        this.biayaPendaftaran = biayaPendaftaran;
        this.biayaObat = biayaObat;
        this.biayaVitamin = biayaVitamin;
        this.biayaDokter = biayaDokter;
    }

    int hitungTotalBiaya() {
        return biayaPendaftaran + biayaObat + biayaVitamin + biayaDokter;
    }
}
