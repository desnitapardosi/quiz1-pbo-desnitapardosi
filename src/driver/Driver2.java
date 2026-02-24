// Nama : Desnita Pardosi
// Nim  : 12S24043

package driver; 

import java.util.Scanner;

public class Driver2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input Jumlah total data (N)
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            // 2. Input Deret nilai (n1, n2, ..., n) disimpan dalam array
            int[] nilaiSiswa = new int[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextInt()) {
                    nilaiSiswa[i] = sc.nextInt();
                }
            }

            // 3. Input Kode kelompok siswa
            if (sc.hasNextInt()) {
                int kodeKelompok = sc.nextInt();

                // Berdasarkan gambar pola, diasumsikan 1 kelompok berisi 2 siswa
                int ukuranKelompok = 2;
                int totalNilai = 0;

                // Menentukan indeks awal dan akhir kelompok dalam array
                int start = (kodeKelompok - 1) * ukuranKelompok;
                int end = start + ukuranKelompok;

                // Menjumlahkan nilai hanya untuk kelompok yang diminta
                for (int i = start; i < end; i++) {
                    if (i < n) { // Mencegah Error jika indeks melampaui N
                        totalNilai += nilaiSiswa[i];
                    }
                }

                // Output hasil penjumlahan kelompok
                System.out.println(totalNilai);
            }
        }
        sc.close();
    }
}