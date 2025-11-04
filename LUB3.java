import java.util.Scanner;

public class LUB3 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta ukuran matriks dari pengguna
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();

        // Membuat dua matriks dan satu matriks hasil
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        // Input elemen untuk matriks pertama
        System.out.println("\nMasukkan elemen matriks pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks1[" + i + "][" + j + "]: ");
                matriks1[i][j] = input.nextInt();
            }
        }

        // Input elemen untuk matriks kedua
        System.out.println("\nMasukkan elemen matriks kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks2[" + i + "][" + j + "]: ");
                matriks2[i][j] = input.nextInt();
            }
        }

        // Proses penjumlahan kedua matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        // Menampilkan hasil penjumlahan
        System.out.println("\n=== HASIL PENJUMLAHAN MATRKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
