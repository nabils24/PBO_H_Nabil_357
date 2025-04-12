/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul2;
import java.util.Scanner;


/**
 * Class LoginSystem - Deskripsi singkat mengenai kelas ini.
 */
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat data login untuk admin dan mahasis
        Admin admin = new Admin("admin", "admin123");
        Mahasiswa mahasiswa = new Mahasiswa("12345", "mhs123");

        System.out.println("=== Sistem Login ===");
        System.out.println("Pilih tipe login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1|2): ");

        String pilihan = scanner.nextLine().trim();

        if (pilihan.isEmpty()) {
            System.out.println("Pilihan tidak boleh kosong. Program dihentikan.");
            scanner.close();
            return;
        }

        switch (pilihan) {
            case "1":
                // Proses login Admin
                System.out.print("Masukkan username: ");
                String usernameInput = scanner.nextLine().trim();
                System.out.print("Masukkan password: ");
                String passwordInput = scanner.nextLine().trim();

                if (admin.login(usernameInput, passwordInput)) {
                    admin.displayInfo();
                } else {
                    System.out.println("Login admin gagal. Periksa kembali username dan password.");
                }
                break;
            case "2":
                // Proses login Mahasiswa
                System.out.print("Masukkan NIM: ");
                String nimInput = scanner.nextLine().trim();
                System.out.print("Masukkan password: ");
                String passInput = scanner.nextLine().trim();

                if (mahasiswa.login(nimInput, passInput)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login mahasiswa gagal. Periksa kembali NIM dan password.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid. Program dihentikan.");
                break;
        }
        scanner.close();
    }
}
