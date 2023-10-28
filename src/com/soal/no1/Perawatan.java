import java.util.Scanner;

public class Perawatan {
    Scanner s = new Scanner(System.in);

    final int facialPriceBasic = 50_000;
    final int facialPriceGold = 100_000;

    final int maskFruit = 40_000;
    final int maskSmear = 75_000;

    final int notWash = 20_000;
    final int wash = 35_000;

    int finalPrice = 0;

    int maskPrice;
    int hairCut;
    int customer;

    void showPerawatanMenu() {
        System.out.println();
        System.out.println("Jenis Perawatan");
        System.out.println("1. Facial Wajah");
        System.out.println("2. Masker");
        System.out.println("3. Potong Rambut");
        System.out.println();
        System.out.print("Pilihan Anda : ");
        int userChoice = s.nextInt();

        // Facial Wajah
        if (userChoice == 1) {
            System.out.println("1. Facial Biasa Rp. 50.000");
            System.out.println("2. Facial Emas Rp. 100.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            System.out.println();
            int typeFacial = s.nextInt();

            System.out.print("Berapa Orang : ");
            customer = s.nextInt();

            if (typeFacial == 1) {
                calcFacialPrice(customer, facialPriceBasic);
            }

            if (typeFacial == 2) {
                calcFacialPrice(customer, facialPriceGold);
            }
            System.out.println("Data Tersimpan");
        }

        // Masker
        if (userChoice == 2) {
            System.out.println("1. Masker Buah Rp. 40.000");
            System.out.println("2. Masker Lumpur Rp. 75.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            System.out.println();
            int typeFacial = s.nextInt();

            System.out.print("Berapa Orang : ");
            customer = s.nextInt();

            if (typeFacial == 1) {
                calcMaskPrice(customer, maskFruit);
            }

            if (typeFacial == 2) {
                calcMaskPrice(customer, maskSmear);

            }
            System.out.println("Data Tersimpan");
        }

        // Potong Rambut
        if (userChoice == 3) {
            System.out.println("1. Tidak Keramas Rp. 20.000");
            System.out.println("2. Keramas Rp. 35.000");
            System.out.println();
            System.out.print("Masukan Pilihan Anda : ");
            System.out.println();
            int typeFacial = s.nextInt();

            System.out.print("Berapa Orang : ");
            customer = s.nextInt();

            if (typeFacial == 1) {
                calcHaircutPrice(customer, notWash);
            }

            if (typeFacial == 2) {
                calcHaircutPrice(customer, wash);

            }
            System.out.println("Data Tersimpan");
        }

    }

    public int calcFacialPrice(int customer, int facialPrice) {
        return finalPrice = customer * facialPrice;

    }

    public int calcMaskPrice(int customer, int maskPrice) {
        return finalPrice = customer * maskPrice;
    }

    public int calcHaircutPrice(int customer, int hairCut) {
        return finalPrice = customer * hairCut;
    }

    public int finalPrice() {
        return finalPrice;
    }

}