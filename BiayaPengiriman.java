import java.util.Scanner;

public class BiayaPengiriman {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();
        double volume = panjang * lebar * tinggi;
        double biayaTarifPerKg = 0;
        if (jarak <= 10) {
            biayaTarifPerKg = 4250;
        } else {
            biayaTarifPerKg = 6000;
        }
        double biayaDasar = berat * biayaTarifPerKg;
        double biayaVolume = 0;
        if (volume > 100) {
            biayaVolume = 50000;
        }
        double totalBiaya = biayaDasar + biayaVolume;
        System.out.println("\n--- Rincian Biaya Pengiriman ---");
        System.out.println("Berat Paket: " + berat + " kg");
        System.out.println("Jarak Tempuh: " + jarak + " km");
        System.out.println("Volume Paket: " + volume + " cm^3");
        System.out.println("Biaya Dasar (Berat x Jarak): Rp " + biayaDasar);
        if (volume > 100) {
            System.out.println("Biaya Tambahan Volume (>100 cm^3): Rp " + biayaVolume);
        }
        System.out.println("Total Biaya Pengiriman: Rp " + totalBiaya);

        input.close();
    }
}
   