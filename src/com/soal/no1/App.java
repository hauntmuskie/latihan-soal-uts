import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static String name, noTelp;
    static Scanner s = new Scanner(System.in);
    static Boolean isContinue = false;
    static String isInputAgain;
    static int finalSumResult;

    public static void main(String[] args) {

        Perawatan perawatan = new Perawatan();
        Penyewaan penyewaan = new Penyewaan();

        ArrayList<Integer> finalSumCollection = new ArrayList<>();

        System.out.println("Selamat Datang di Salon Cantika");

        System.out.print("Masukan Nama Pelanggan : ");
        name = s.nextLine();

        System.out.print("Masukkan No.Telp Pelanggan : ");
        noTelp = s.nextLine();
        System.out.println();

        System.out.print("Lakukan Transaksi ? [y/T] ? ");
        String isTransaction = s.nextLine();
        System.out.println();

        if (!isTransaction.equalsIgnoreCase("y")) {
            return;
        }

        do {
            System.out.println("Menu Pilihan Yang Tersedia : ");
            System.out.println("1. Perawatan");
            System.out.println("2. Penyewaan");
            System.out.println();
            System.out.print("Pilihan Menu : ");
            int careOrRental = s.nextInt();
            s.nextLine();

            if (careOrRental == 1) {
                perawatan.showPerawatanMenu();
                System.out.println("Harga Sebesar : Rp. " + perawatan.finalPrice);

            }

            if (careOrRental == 2) {
                penyewaan.showRiasMenu();
                System.out.println("Harga Sebesar : Rp. " + penyewaan.finalPrice);

            }

            System.out.println();

            System.out.print("Input Lagi [y/T] ? ");
            isInputAgain = s.nextLine();

            finalSumCollection.add(perawatan.finalPrice);
            finalSumCollection.add(penyewaan.finalPrice);

            for (Integer integer : finalSumCollection) {
                finalSumResult += integer;
            }
            finalSumResult = finalSumCollection.stream().mapToInt(Integer::intValue).sum();

            if (!isInputAgain.equalsIgnoreCase("y")) {
                System.out.printf("Total Yang Harus Dibayar : Rp. %,.0f%n", (double) finalSumResult);
                // System.out.printf("Total Yang Harus Dibayar : Rp. " + finalSumResult);
                System.out.println();
                System.out.println("Terimakasih " + name
                        + " Sudah datang di Salon Cantika Membuat Anda Cantik adalah Keahlian Kami");
                return;
            }

            isContinue = true;

        } while (isContinue);
    }
}