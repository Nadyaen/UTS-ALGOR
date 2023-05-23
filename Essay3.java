import java.util.Scanner;
public class Essay3 {

    public static void main(String[] args) {
        // Harga tiket
        try (Scanner scanner = new Scanner(System.in)) {
            // Harga tiket
            int hargaKategori1 = 5000000;
            int hargaKategori2 = 4000000;
            int hargaKategori3 = 3250000;
            int hargaKategori4 = 2500000;
            // Input kategori tiket yang diinginkan
            System.out.println("Pilih kategori tiket:");
            System.out.println("1. Kategori 1 (Rp 5,000,000)");
            System.out.println("2. Kategori 2 (Rp 4,000,000)");
            System.out.println("3. Kategori 3 (Rp 3,250,000)");
            System.out.println("4. Kategori 4 (Rp 2,500,000)");
            System.out.print("Masukkan nomor kategori: ");
            int nomorKategori = scanner.nextInt();
            // Input jumlah tiket yang ingin dibeli
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlahTiket = scanner.nextInt();
            // Menentukan harga berdasarkan kategori yang dipilih
            int hargaTiket = 0;
            if (nomorKategori == 1) {
                hargaTiket = hargaKategori1;
            } else if (nomorKategori == 2) {
                hargaTiket = hargaKategori2;
            }else if (nomorKategori == 3) {
                hargaTiket = hargaKategori3;
            }else if (nomorKategori == 4) {
                hargaTiket = hargaKategori4;
            }else {
                System.out.println("Kategori yang dimasukkan tidak valid!");
                scanner.close();
                return;
            }   // Menghitung total harga
            int totalHarga = jumlahTiket * hargaTiket;
            // Menampilkan informasi pembelian
            System.out.println("\n----- Informasi Pembelian Tiket -----");
            System.out.println("Kategori tiket: " + nomorKategori);
            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Harga tiket per unit: Rp " + hargaTiket);
            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println("--------------------------------------");
            
        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int payment = scanner.nextInt();


        int change = payment - totalHarga;

        System.out.println("Kembalian: Rp" + change);
        System.out.println("=============================================");

        }

}
}
