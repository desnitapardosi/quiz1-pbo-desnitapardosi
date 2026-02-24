// Nama : Desnita Pardosi
// Nim  : 12S24043

package driver;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> daftarAsrama = new ArrayList<>();
        ArrayList<String> daftarNama = new ArrayList<>();
        ArrayList<Double> daftarBerat = new ArrayList<>();

        while (sc.hasNext()) {
            String asrama = sc.next();
            if (asrama.equalsIgnoreCase("END")) {
                break;
            }

            String nama = sc.next();
            double berat = sc.nextDouble();

            daftarAsrama.add(asrama);
            daftarNama.add(nama);
            daftarBerat.add(berat);
        }

        System.out.println("\nREKAPITULASI PENJEMPUTAN LAUNDRY ASRAMA (RABU)");
        System.out.println("=================================================");
        System.out.printf("%-15s | %-15s | %-8s\n", "ASRAMA", "NAMA", "BERAT");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < daftarNama.size(); i++) {
            System.out.printf("%-15s | %-15s | %.1f kg\n", 
                daftarAsrama.get(i), daftarNama.get(i), daftarBerat.get(i));
        }
        System.out.println("=================================================");
        System.out.println("Total Mahasiswa Terdata: " + daftarNama.size());

        sc.close();
    }
}
