// Nama : Desnita Pardosi
// Nim : 12S24043


// soal 1
package driver; 

import java.util.Scanner;
import java.util.ArrayList;

public class Driver1 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> pesananNama = new ArrayList<>();
        ArrayList<Integer> pesananPorsi = new ArrayList<>();
        ArrayList<Integer> pesananHarga = new ArrayList<>();
        ArrayList<Integer> pesananTotal = new ArrayList<>();
        
        int totalSemua = 0;

        while (sc.hasNext()) {
            String kode = sc.next();
            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            int porsiButet = sc.nextInt();
            int totalPorsiPerMenu = porsiButet * 3; 

            String namaMenu = "";
            int hargaSatuan = 0;

            // Mapping Kode Menu (Lengkapi sesuai tabel soal)
            if (kode.equals("NGS")) {
                namaMenu = "Nasi Goreng Spesial"; hargaSatuan = 15000;
            } else if (kode.equals("AP")) {
                namaMenu = "Ayam Penyet"; hargaSatuan = 20000;
            } else if (kode.equals("GG")) {
                namaMenu = "Gado-Gado"; hargaSatuan = 15000;
            }

            int subtotal = totalPorsiPerMenu * hargaSatuan;
            pesananNama.add(namaMenu);
            pesananPorsi.add(totalPorsiPerMenu);
            pesananHarga.add(hargaSatuan);
            pesananTotal.add(subtotal);
            totalSemua += subtotal;
        }

        // Cetak Output (Gunakan printf agar rapi sesuai struk)
        System.out.printf("%-20s %-8s %-8s %-8s\n", "Menu", "Porsi", "Harga", "Total");
        System.out.println("==========================================================");
        for (int i = 0; i < pesananNama.size(); i++) {
            System.out.printf("%-20s %-8d %-8d %-8d\n", 
                pesananNama.get(i), pesananPorsi.get(i), 
                pesananHarga.get(i), pesananTotal.get(i));
        }
        System.out.println("==========================================================");
        System.out.println("Total Pembayaran               " + totalSemua);
        
        sc.close();
    }

}
