/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package Tugas.modul3;
import java.util.Scanner;


/**
 * Class Login - Deskripsi singkat mengenai kelas ini.
 */
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pilihan login
        System.out.println("Pilih tipe login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        int pilihanUser = scanner.nextInt();
        scanner.nextLine();  // mengambil input user

        if (pilihanUser == 1) {
            // Login sebagai Admin
            System.out.println("Masukkan username:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password:");
            String password = scanner.nextLine();

            // Membuat objek Admin dan mencoba login
            Admin admin = new Admin("Admin", "2024", username, password);
            admin.loginSystem();
        } else if (pilihanUser == 2) {
            // Login sebagai Mahasiswa
            System.out.println("Masukkan nama mahasiswa:");
            String namaMahasiswa = scanner.nextLine();
            System.out.println("Masukkan NIM mahasiswa:");
            String nimMahasiswa = scanner.nextLine();

            // Membuat objek Mahasiswa dan mencoba login
            Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa);
            mahasiswa.loginSystem();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
