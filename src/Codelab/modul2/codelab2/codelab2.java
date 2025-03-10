/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Codelab.modul2.codelab2;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Class codelab2 - Deskripsi singkat mengenai kelas ini.
 */
public class codelab2 {

    public static void main(String[] args) {
        /**
         * Membuat Arraylist dengan objek rekBank dengan nama daftarRekening
         */
        ArrayList<rekBank> daftarRekening = new ArrayList<>();

        /**
         * membuat input dari libary Scanner
         */
        Scanner input = new Scanner(System.in);

        /**
         * membuat rekening pertama
         */
        System.out.println("Masukkan data untuk rekening pertama:");
        System.out.print("Nomor Rekening: ");
        String nomorRekening1 = input.nextLine();
        System.out.print("Nama Pemilik: ");
        String namaPemilik1 = input.nextLine();
        System.out.print("Saldo Awal: ");
        double saldo1 = input.nextDouble();
        input.nextLine(); // agar input kosong dan tidak membuat double inputan
        rekBank rekening1 = new rekBank(nomorRekening1, namaPemilik1, saldo1);
        daftarRekening.add(rekening1);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Rekening Baru");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Lihat Informasi Rekening");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1/2/3/4/5): ");
            int pilihan = input.nextInt();
            input.nextLine(); // agar input kosong dan tidak membuat double inputan

            switch (pilihan) {
                case 1: // Menambahkan rekening baru
                    System.out.println("Masukkan data untuk rekening baru:");
                    System.out.print("Nomor Rekening: ");
                    String nomorRekeningBaru = input.nextLine();
                    System.out.print("Nama Pemilik: ");
                    String namaPemilikBaru = input.nextLine();
                    System.out.print("Saldo Awal: ");

                    double saldoBaru = input.nextDouble();
                    input.nextLine(); // agar input kosong dan tidak membuat double inputan
                    rekBank rekeningBaru = new rekBank(nomorRekeningBaru, namaPemilikBaru, saldoBaru);

                    daftarRekening.add(rekeningBaru);
                    System.out.println("Rekening baru berhasil ditambahkan!");
                    break;

                case 2: // Setor uang
                    /**
                     * mencari rekening dari daftarRekening
                     */
                    System.out.print("Masukkan nomor rekening untuk setor uang: ");
                    String nomorRekeningSetor = input.nextLine();
                    rekBank rekeningSetor = findRekening(daftarRekening, nomorRekeningSetor);

                    /**
                     * jika rekeningSetor tidak sama dengan null maka input dari setorJumlah akan dientry diobject setorUang
                     */
                    if (rekeningSetor != null) {
                        System.out.print("Masukkan jumlah uang yang disetor: ");
                        double setorJumlah = input.nextDouble();
                        rekeningSetor.setorUang(setorJumlah);
                    } else {
                        System.out.println("Rekening tidak ditemukan!");
                    }
                    break;

                case 3: // Tarik uang
                    /**
                     * mencari rekening dari daftarRekening
                     */
                    System.out.print("Masukkan nomor rekening untuk tarik uang: ");
                    String nomorRekeningTarik = input.nextLine();
                    rekBank rekeningTarik = findRekening(daftarRekening, nomorRekeningTarik);

                    if (rekeningTarik != null) {
                        System.out.print("Masukkan jumlah uang yang ditarik: ");
                        double tarikJumlah = input.nextDouble();
                        rekeningTarik.tarikUang(tarikJumlah);
                    } else {
                        System.out.println("Rekening tidak ditemukan!");
                    }
                    break;

                case 4: // Lihat informasi rekening
                    /**
                     * mencari rekening dari daftarRekening
                     */
                    System.out.print("Masukkan nomor rekening untuk melihat informasi: ");
                    String nomorRekeningLihat = input.nextLine();
                    rekBank rekeningLihat = findRekening(daftarRekening, nomorRekeningLihat);

                    if (rekeningLihat != null) {
                        rekeningLihat.tampilkanInfo();
                    } else {
                        System.out.println("Rekening tidak ditemukan!");
                    }
                    break;

                case 5: // Keluar dari aplikasi
                    System.out.println("Terima kasih! Program selesai.");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        input.close();
    }

    // Method untuk mencari rekening berdasarkan nomor rekening
    public static rekBank findRekening(ArrayList<rekBank> daftarRekening, String nomorRekening) {
        /**
         * for each untuk mencari data rekBank dari collection daftarRekening
         */
        for (rekBank rekening : daftarRekening) {
            if (rekening.getNomorRekening().equals(nomorRekening)) {
                return rekening;
            }
        }
        return null; // Jika tidak ditemukan
    }
}
