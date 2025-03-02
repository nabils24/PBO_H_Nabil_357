/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul1;


/**
 * Class tugas1 - Tugas 1 berdasarkan modul 1 yaitu tugas membuat login sederhana dengan 2 yaitu admin, mahasiswa.
 */
import java.util.Scanner;

public class tugas1 {

    private String username;
    private String password;
    private String namaMahasiswa;
    private String nim;

    // Constructor
    tugas1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Constructor
    tugas1(String namaMahasiswa, String nim, boolean isMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
    }

    /**
     * Fungsi untuk login admin yaitu 2 variable
     * String validUsername
     * String validPassword
     * dan mengembalikan nilai keduanya @return
     *
     */
    public boolean loginAdminUMM() {
        String validUsername = "Admin010";
        String validPassword = "password010";
        return this.username.equals(validUsername) && this.password.equals(validPassword);
    }
    /**
     * Fungsi untuk login admin yaitu 2 variable
     * String validNama
     * String validNIM
     * dan mengembalikan nilai keduanya @return
     *
     */
    public boolean loginMahasiswaUMM() {
        String validNama = "Nabils";
        String validNIM = "202410370110357";
        return this.namaMahasiswa.equals(validNama) && this.nim.equals(validNIM);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {

            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();

            tugas1 admin = new tugas1(username, password);
            if (admin.loginAdminUMM()) {
                System.out.println("Selamat Datang, " + username + "!");
                System.out.println("========USER========");
                System.out.println("Nama : " + username);
                System.out.println("Password  : " + password);
                System.out.println("========SELESAI========");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }


        }  else if (pilihan == 2) {
                System.out.print("Masukkan Nama: ");
                String namaMahasiswa = scanner.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = scanner.nextLine();

                if (nim.length() != 15) {
                    System.out.println("Login gagal! NIM harus terdiri dari 14 digit.");
                }

                tugas1 mahasiswa = new tugas1(namaMahasiswa, nim, true);
                if (mahasiswa.loginMahasiswaUMM()) {
                    System.out.println("Selamat Datang, " + namaMahasiswa + "!");
                    System.out.println("========USER========");
                    System.out.println("Nama : " + namaMahasiswa);
                    System.out.println("NIM  : " + nim);
                    System.out.println("========SELESAI========");
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
            }

            else {
                System.out.println("Pilihan tidak valid.");
                System.exit(1);
            }
        }

}
