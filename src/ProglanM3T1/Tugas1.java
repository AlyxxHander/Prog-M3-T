package ProglanM3T1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tugas1 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> listPesanan = new ArrayList<>();
    ArrayList<Double> listHargaPesanan = new ArrayList<>();
    ArrayList<Integer> listJumlahPesanan = new ArrayList<>();

    void restaurantLogo() {
        System.out.println("  ################################");
        System.out.println("  #                              #");
        System.out.println("  #    WELCOME TO THE DELIGHT    #");
        System.out.println("  #                              #");
        System.out.println("  #   ~~~~~~~~~~~~~~~~~~~~~~~~   #");
        System.out.println("  #   |   ~~~~~~~    ~~~~~   |   #");
        System.out.println("  #   |   |     |    |   |   |   #");
        System.out.println("  #   |   |     |    |   |   |   #");
        System.out.println("  #   |   |     |    |   |   |   #");
        System.out.println("  #   |   ~~~~~~~    ~~~~~   |   #");
        System.out.println("  #   |______________________|   #");
        System.out.println("  #                              #");
        System.out.println("  ################################");
        System.out.println("            |        |");
        System.out.println("           ( )      ( )");
    }
    void inputPemesanan() {
    /*
    1) Pesanan (S)
    2) HargaPesanan (D)
    3) JumlahPesanan (I)
    */
        String status = "y";
        while(status.equalsIgnoreCase("y")) {
            System.out.println("=======================================");
            System.out.print("Masukkan menu pesanan: ");
            listPesanan.add(scanner.nextLine());
            System.out.print("Masukkan harga pemesanan: Rp. ");
            listHargaPesanan.add(scanner.nextDouble());
            System.out.print("Masukkan jumlah pemesanan: ");
            listJumlahPesanan.add(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Tambah pesan lagi? (y/n)");
            status = scanner.nextLine();
        }

        funcPemesanan();
    }

    void funcPemesanan() {
        double totalHarga = 0;
        for(int i = 0; i < listPesanan.size(); i++) {
            totalHarga += (listHargaPesanan.get(i) * listJumlahPesanan.get(i));
        }

        outputPemesanan(totalHarga);
    }

    void outputPemesanan(double totalHarga) {
        for(int i = 0; i < listPesanan.size(); i++) {
            System.out.println(listPesanan.get(i) + " | Rp. " + listHargaPesanan.get(i) + " | " + listJumlahPesanan.get(i) + "x");
        }
        System.out.println("Jumlah: Rp. "+(int)totalHarga);
    }

    public static void main(String[] args) {
        ProglanM3T1.Tugas1 t = new ProglanM3T1.Tugas1();
        t.restaurantLogo();
        t.inputPemesanan();
    }
}

